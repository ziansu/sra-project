public void insert(java.lang.String key, java.lang.String word) {
    if ((key == null) || (word == null))
        throw new java.lang.NullPointerException();
    
    java.util.LinkedList<java.lang.String> tuple = this.table.get(key);
    if (tuple == null)
        this.table.put(key, (tuple = new java.util.LinkedList<java.lang.String>()));
    
    tuple.add(word);
}