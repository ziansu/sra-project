private static java.lang.String determineTicketSuffixByHostName() {
    try {
        final java.lang.String hostName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
        final int index = hostName.indexOf('.');
        if (index > 0) {
            return hostName.substring(0, index);
        }
        return hostName;
    } catch (final java.net.UnknownHostException e) {
        throw new java.lang.RuntimeException("Host name could not be determined automatically for the ticket suffix.", e);
    }
}