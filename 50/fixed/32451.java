public java.util.Set<org.onosproject.net.ConnectPoint> getEgressConnectPoints() {
    java.util.Set<org.onosproject.net.ConnectPoint> cps = new java.util.HashSet<org.onosproject.net.ConnectPoint>();
    for (org.onosproject.mfwd.impl.McastConnectPoint mcp : egressPoints) {
        cps.add(mcp.getConnectPoint());
    }
    return cps;
}