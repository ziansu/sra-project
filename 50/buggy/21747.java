public void registerServer(final com.dmdirc.Server server) {
    synchronized(servers) {
        servers.add(server);
    }
}