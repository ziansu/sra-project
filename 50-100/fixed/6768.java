private int skip(int n_skip) throws java.io.IOException {
    int n_skipped = 0;
    skipWhiteSpace();
    if ((((current) != ',') && ((current) != ']')) && ((current) != '}')) {
        skipInner();
        n_skipped = 1;
    }
    while (((current) == ',') && ((n_skipped++) != n_skip)) {
        skipWhiteSpace();
        skipInner();
    } 
    return n_skipped;
}