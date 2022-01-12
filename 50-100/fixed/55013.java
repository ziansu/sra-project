public java.util.List<com.dmdirc.Server> getServersByAddress(final java.lang.String address) {
    final java.util.List<com.dmdirc.Server> res = new java.util.ArrayList<com.dmdirc.Server>();
    for (com.dmdirc.Server server : servers) {
        if (server.getAddress().equalsIgnoreCase(address)) {
            res.add(server);
        }
    }
    return res;
}