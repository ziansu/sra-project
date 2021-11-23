public int getport(java.lang.String server) {
    discovery.Discovery.RegistryEntry entry = resolveServer(server);
    if (entry != null) {
        return entry.getPort();
    }
    return 0;
}