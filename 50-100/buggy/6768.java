private int skip(int n_skip) throws java.io.IOException {
    int n_skipped = 0;
    skipWhiteSpace();
    if ((((current) != ',') && ((current) != ']')) && ((current) != '}')) {
        skipInner();
    }
    while ((current) == ',') {
        skipWhiteSpace();
        skipInner();
        if ((++n_skipped) == n_skip) {
            break;
        }
    } 
    return n_skipped;
}