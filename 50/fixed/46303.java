public int getPort(java.lang.String server) {
    discovery.Discovery.RegistryEntry entry = resolveServer(server);
    if (entry != null) {
        return entry.getPort();
    }
    return 0;
}