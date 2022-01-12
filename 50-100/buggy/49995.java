public void disconnectInterface(Sim.SimEnt link) {
    for (int i = 0; i < (_interfaces); i++)
        if ((_routingTable[i]) != null) {
            if (link == (_routingTable[i].link())) {
                _routingTable[interfaceNumber] = null;
            }
        }
    
    java.lang.System.out.println("Trying to disconnect fromto port not in router");
}