public model.Book get(java.lang.String isbn) {
    int firstHash = hashFunctionOne(isbn);
    int secondHash = hashFunctionTwo(isbn);
    if (((table[firstHash]) != null) && ((table[firstHash].getKey()) == firstHash)) {
        return table[firstHash].getValue();
    }else {
        return table[secondHash].getValue();
    }
}