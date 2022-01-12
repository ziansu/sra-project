public void insert(T symbol) {
    int h = hashingStrategy.computeHashCode(symbol);
    if (!(symbol2Id.containsKey(h))) {
        int newId = -1;
        synchronized(this) {
            newId = ++(nextId);
        }
        symbol2Id.put(h, newId);
        id2symbol.put(newId, symbol);
    }
}