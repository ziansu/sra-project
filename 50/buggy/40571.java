public void merge(edu.brandeis.cs.nlp.mae.util.HashedCollection<K, V> newHash) {
    for (K key : newHash.keySet()) {
        putCollection(key, newHash.get(key));
    }
}