public boolean ifConfig() {
    java.util.Enumeration<java.net.NetworkInterface> nets;
    try {
        nets = java.net.NetworkInterface.getNetworkInterfaces();
        for (java.net.NetworkInterface netint : java.util.Collections.list(nets))
            displayInterfaceInformation(netint);
        
    } catch (java.net.SocketException e) {
        return false;
    }
    return true;
}