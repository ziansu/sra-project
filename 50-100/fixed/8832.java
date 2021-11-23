public java.lang.Long next() {
    long result = 0;
    while (result == 0) {
        if (!(hasNext())) {
            throw new java.util.NoSuchElementException();
        }
        result = puzzleStorage.puzzles[cursor];
        (cursor)++;
    } 
    return result;
}