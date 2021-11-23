private boolean equal(java.lang.Object[] a, java.lang.Object[] b) {
    if ((a.length) != (b.length))
        return false;
    
    java.util.List lA = scala.actors.threadpool.Arrays.asList(a);
    java.util.List lB = scala.actors.threadpool.Arrays.asList(b);
    return lA.containsAll(lB);
}