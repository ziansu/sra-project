public void initServer(int placeCount, int philliCount) {
    this.placeCount = placeCount;
    this.philosophCount = philliCount;
    initClients();
    vss.a4.server.DistributionServer.logging("waiting time is over");
}