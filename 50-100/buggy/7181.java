public void putAll(java.util.HashMap<java.lang.String, K> add) {
    java.util.Iterator<java.util.Map.Entry<java.lang.String, K>> entryIt = add.entrySet().iterator();
    while (entryIt.hasNext()) {
        java.util.Map.Entry<java.lang.String, K> entry = entryIt.next();
        put(entry.getKey(), entry.getValue());
    } 
}