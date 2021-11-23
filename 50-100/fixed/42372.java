@java.lang.Override
public boolean isAvailable(int port) {
    org.trustedanalytics.servicebroker.h2oprovisioner.ports.SocketInstantiationPortChecker.LOGGER.info(("Checking port: " + port));
    java.net.ServerSocket socket;
    try {
        socket = new java.net.ServerSocket(port);
    } catch (java.io.IOException e) {
        org.trustedanalytics.servicebroker.h2oprovisioner.ports.SocketInstantiationPortChecker.LOGGER.debug("Error when creating ServerSocket object.", e);
        return false;
    }
    try {
        socket.close();
    } catch (java.io.IOException e) {
        org.trustedanalytics.servicebroker.h2oprovisioner.ports.SocketInstantiationPortChecker.LOGGER.debug("Error when closing ServerSocket object.", e);
        return false;
    }
    return true;
}