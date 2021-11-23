public void unregisterServer(final com.dmdirc.Server server) {
    synchronized(servers) {
        servers.remove(server);
    }
}