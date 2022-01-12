private void loadServerStubs() {
    if ((this.configuration) == null) {
        return ;
    }
    this.calculationServers = new java.util.ArrayList<distributor.ServerInterface>();
    for (distributor.ServerInformation serverInfo : this.configuration.getServers()) {
        distributor.ServerInterface stub = this.loadServerStub(serverInfo);
        this.calculationServers.add(stub);
    }
}