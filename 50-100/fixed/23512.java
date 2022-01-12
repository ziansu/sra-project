public java.util.List<com.dmdirc.Server> getServersByNetwork(final java.lang.String network) {
    final java.util.List<com.dmdirc.Server> res = new java.util.ArrayList<com.dmdirc.Server>();
    for (com.dmdirc.Server server : servers) {
        if (server.isNetwork(network)) {
            res.add(server);
        }
    }
    return res;
}