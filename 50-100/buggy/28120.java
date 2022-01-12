public void putItem(K key, V value) {
    try {
        edu.brandeis.cs.nlp.mae.util.HashedList.getAsList(key).add(value);
    } catch (java.lang.NullPointerException e) {
        java.util.ArrayList<V> newlist = new java.util.ArrayList<>();
        newlist.add(value);
        hash.put(key, newlist);
    }
}