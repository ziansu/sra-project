public void insert(T symbol) {
    int h = hashingStrategy.computeHashCode(symbol);
    synchronized(this) {
        if (!(symbol2Id.containsKey(h))) {
            int newId = ++(nextId);
            symbol2Id.put(h, newId);
            id2symbol.put(newId, symbol);
        }
    }
}