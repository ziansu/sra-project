public static void main(java.lang.String[] args) {
    java.lang.System.out.println("server main");
    ncu.sw.gameServer.ServerGameController gameController = new ncu.sw.gameServer.ServerGameController(100, 20, 20);
    ncu.sw.gameServer.TCPMultiServer server = new ncu.sw.gameServer.TCPMultiServer(9000);
    new java.lang.Thread(server).start();
    ncu.sw.gameServer.UDPBroadCastClient.getInstance().setCmd(gameController.getCmd());
    ncu.sw.gameServer.UDPBroadCastClient.getInstance().startUDPBroadcast();
}