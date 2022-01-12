public main.java.mmas.serenderp.util.SparseVector getHead(int i) {
    if (null == (randomVectorDistances)) {
        throw new java.lang.RuntimeException("wtf?");
    }
    if (null == (randomVectorDistances.get(i))) {
        throw new java.lang.RuntimeException("wtf?");
    }
    if (null == (randomVectorDistances.get(i).peek())) {
        throw new java.lang.RuntimeException("wtf?");
    }
    return randomVectorDistances.get(i).peek().getRight();
}