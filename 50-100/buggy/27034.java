private static java.lang.String determineTicketSuffixByHostName() {
    try {
        final java.lang.String hostName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
        if ((hostName.indexOf('.')) > 0) {
            return hostName.substring(0, hostName.indexOf('.'));
        }
        return hostName;
    } catch (final java.net.UnknownHostException e) {
        throw new java.lang.RuntimeException("Host name could not be determined automatically for the ticket suffix.", e);
    }
}