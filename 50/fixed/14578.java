public com.spbau.wimag.hw1.Node insert(char c, int n) {
    if (n <= 0) {
        return null;
    }
    com.spbau.wimag.hw1.Node result = insert(c);
    result.addToEntryCount((n - 1));
    return result;
}