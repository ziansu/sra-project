public java.util.Set<decc.dht.Key> get(decc.dht.Key k) {
    java.util.Map<decc.dht.Key, java.lang.Long> rts = routes.get(k);
    java.util.Set<decc.dht.Key> ks = null;
    if (rts != null)
        ks = rts.keySet();
    
    return ks;
}