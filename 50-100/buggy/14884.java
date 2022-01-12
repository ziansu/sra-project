private static java.net.NetworkInterface getNetworkInterface() throws java.net.SocketException {
    java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
    while (networkInterfaces.hasMoreElements()) {
        java.net.NetworkInterface networkInterface = networkInterfaces.nextElement();
        byte[] hardwareAddress = networkInterface.getHardwareAddress();
        if ((hardwareAddress.length) > 4)
            return networkInterface;
        
    } 
    return null;
}