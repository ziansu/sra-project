public void create() {
    com.ame.bus3.common.Variables.isServer = true;
    com.ame.bus3.common.TileRegisterer.load();
    com.ame.bus3.common.packetsorters.SorterList.loadSorters();
    com.ame.bus3.common.Variables.port = 25566;
    com.ame.bus3.server.ConnectionAccepter accepter = new com.ame.bus3.server.ConnectionAccepter();
    java.lang.Thread accepterThread = new java.lang.Thread(accepter, "ConnectionAccepter");
    accepterThread.start();
    java.lang.System.out.println("[Info] Finished initalising");
}