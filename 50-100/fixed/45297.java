private boolean equal(java.lang.Object[] a, java.lang.Object[] b) {
    if ((a.length) != (b.length))
        return false;
    
    java.util.List lA = java.util.Arrays.asList(a);
    java.util.List lB = java.util.Arrays.asList(b);
    return lA.containsAll(lB);
}