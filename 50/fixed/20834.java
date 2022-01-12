public void addKey(java.io.Serializable key) {
    if (((keys) == null) && (key != null))
        keys = new java.util.Vector<>();
    
    if (key != null)
        keys.add(key);
    
}