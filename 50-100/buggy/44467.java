@java.lang.Override
public archimulator.uncore.net.basic.Port getOutputPort(archimulator.uncore.net.basic.Router router, archimulator.uncore.net.basic.Flit flit) {
    archimulator.uncore.net.basic.Router neighbor = this.agents.get(router).getRoutingTable().calculateNeighbor(flit.getDestination());
    for (archimulator.uncore.net.basic.Port port : router.getLinks().keySet()) {
        if ((router.getLinks().get(port)) == neighbor) {
            return port;
        }
    }
    throw new java.lang.IllegalArgumentException();
}