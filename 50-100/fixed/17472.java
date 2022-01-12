public static void requestSend(org.ftccommunity.simulator.net.protocol.SimulatorData.Type.Types type, org.ftccommunity.simulator.net.protocol.SimulatorData.Data.Modules module, byte[] data) {
    org.ftccommunity.simulator.net.protocol.SimulatorData.Data.Builder sendDataBuilder = SimulatorData.Data.newBuilder();
    sendDataBuilder.setType(SimulatorData.Type.newBuilder().setType(type).build()).setModule(module).addInfo(new java.lang.String(data, com.google.common.base.Charsets.US_ASCII));
    synchronized(org.ftccommunity.simulator.net.manager.NetworkManager.sendingQueue) {
        org.ftccommunity.simulator.net.manager.NetworkManager.sendingQueue.add(sendDataBuilder.build());
    }
}