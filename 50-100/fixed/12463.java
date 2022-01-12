public model.Book get(long key) {
    int firstHash = hashFunctionOne(key);
    int secondHash = hashFunctionTwo(key);
    if (((table[firstHash]) != null) && ((table[firstHash].getKey()) == key)) {
        return table[firstHash].getValue();
    }else {
        return table[secondHash].getValue();
    }
}