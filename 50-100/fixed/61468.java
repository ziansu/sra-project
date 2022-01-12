public static void main(java.lang.String[] args) {
    try {
        org.apache.log4j.BasicConfigurator.configure();
        de.kvwl.n8dA.infrastructure.rewardserver.server.RewardServer rewardServer = new de.kvwl.n8dA.infrastructure.rewardserver.server.RewardServer();
        rewardServer.loadProperties();
        de.kvwl.n8dA.infrastructure.rewardserver.server.RewardServer.REWARD_SERVER_FULL_TCP_ADDRESS = rewardServer.getProperty("REWARD_SERVER_FULL_TCP_ADDRESS");
        de.kvwl.n8dA.infrastructure.rewardserver.server.RewardServer.REWARD_SERVER_REGISTRY_PORT = rewardServer.getProperty("REWARD_SERVER_REGISTRY_PORT");
        rewardServer.startServer(java.lang.Integer.parseInt(de.kvwl.n8dA.infrastructure.rewardserver.server.RewardServer.REWARD_SERVER_REGISTRY_PORT));
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}