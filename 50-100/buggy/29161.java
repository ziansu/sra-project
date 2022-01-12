public boolean equals(java.lang.Object o) {
    if (o instanceof pack1.MapEnt) {
        pack1.MapEnt<K, V> t = ((pack1.MapEnt<K, V>) (o));
        return getKey().equals(t.getValue());
    }else
        return false;
    
}