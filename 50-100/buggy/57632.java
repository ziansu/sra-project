private boolean cache(int count) throws com.stellaris.TokenException, java.io.IOException {
    java.util.Queue<com.stellaris.Token> q;
    boolean res;
    q = queue;
    while ((q.size()) < count) {
        tokenize(q);
    } 
    res = hasRemaining();
    return res;
}