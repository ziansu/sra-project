private static java.net.NetworkInterface getNetworkInterface() throws java.net.SocketException {
    final java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
    while (networkInterfaces.hasMoreElements()) {
        final java.net.NetworkInterface networkInterface = networkInterfaces.nextElement();
        final byte[] hardwareAddress = networkInterface.getHardwareAddress();
        if ((hardwareAddress != null) && ((hardwareAddress.length) > 4))
            return networkInterface;
        
    } 
    return null;
}