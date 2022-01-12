private void initPorts() {
    java.util.List<scs71.com.scscws.data.db.Port> ports = scs71.com.scscws.data.db.Port.getAll();
    java.util.List<java.lang.String> portsNames = new java.util.ArrayList<>();
    if (ports != null) {
        for (scs71.com.scscws.data.db.Port port : ports)
            portsNames.add(port.getPortName());
        
    }
    portsNames.add(0, "Port Name");
    portSpinnerItems = new java.lang.String[portsNames.size()];
    portsNames.toArray(portSpinnerItems);
}