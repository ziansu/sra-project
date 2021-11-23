protected void notify(K key, V oldValue, V newValue) {
    org.mapdb.Bind[] modListeners2 = modListeners;
    for (org.mapdb.Bind.MapListener<K, V> listener : modListeners2) {
        if (listener != null)
            listener.update(key, oldValue, newValue);
        
    }
}