public simpledb.Tuple next() {
    while (hasNext()) {
        if (isSlotUsed(currentIndex)) {
            return tuples[((this.currentIndex)++)];
        }
    } 
    throw new java.lang.UnsupportedOperationException();
}