public simpledb.Tuple next() {
    if (i.hasNext()) {
        return i.next();
    }
    return null;
}