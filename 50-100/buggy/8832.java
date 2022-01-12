public java.lang.Long next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    long result = 0;
    while (result == 0) {
        result = puzzleStorage.puzzles[cursor];
        (cursor)++;
    } 
    return result;
}