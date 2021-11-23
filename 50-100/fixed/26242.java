public void put(K k, V v) throws java.lang.IllegalArgumentException {
    if (k == null) {
        throw new java.lang.IllegalArgumentException();
    }
    HashMap<K, V>.Node n = this.find(k);
    if (n == null) {
        throw new java.lang.IllegalArgumentException();
    }else
        if ((n.placeholder) == true) {
            throw new java.lang.IllegalArgumentException();
        }
    
    n.value = v;
}