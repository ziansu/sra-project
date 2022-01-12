private boolean cache(int count) throws com.stellaris.TokenException, java.io.IOException {
    java.util.Queue<com.stellaris.Token> q;
    boolean res;
    q = queue;
    while ((q.size()) < count) {
        res = tokenize(q);
        if (!res) {
            break;
        }
    } 
    res = hasRemaining();
    return res;
}