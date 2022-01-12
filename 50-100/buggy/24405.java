public void disconnect() {
    if (((execChannel) != null) && (execChannel.isConnected())) {
        execChannel.disconnect();
        org.connid.bundles.unix.UnixConnection.LOG.info("Channel Exec is disconnected.");
    }
    if (((session) != null) && (session.isConnected())) {
        session.disconnect();
        org.connid.bundles.unix.UnixConnection.LOG.info("Session is disconnected.");
    }
}