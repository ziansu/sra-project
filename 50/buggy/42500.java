public long getTotalWords(int sentToThem) {
    if ((countWords[sentToThem]) == 0) {
        throw new java.lang.IllegalStateException("Don't know how to handle this either.");
    }
    return countWords[sentToThem];
}