public void connectInterface(int interfaceNumber, Sim.SimEnt link) {
    if ((interfaceNumber < (_interfaces)) && ((_interface[interfaceNumber]) == null)) {
        _interface[interfaceNumber] = link;
    }else
        java.lang.System.out.println("Trying to connect to port not in router or not empty");
    
    ((Sim.Link) (link)).setConnector(this);
}