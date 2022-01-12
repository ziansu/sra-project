public void put(decc.dht.Key k, decc.dht.Key v) {
    clean();
    java.util.Map<decc.dht.Key, java.lang.Long> rts = routes.get(k);
    if (rts == null) {
        rts = new java.util.TreeMap<>();
        routes.put(k, rts);
    }
    rts.put(v, decc.dht.DhtRoutingTable.DELAY);
}