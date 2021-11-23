protected java.util.Set<java.lang.Integer> createResizedDS(int start, int maxSize) {
    java.util.Set<java.lang.Integer> set = new java.util.HashSet<>();
    for (int i = start; i < maxSize; i++)
        set.add(i);
    
    for (int i = start + 10; i < maxSize; i++)
        set.remove(i);
    
    org.junit.Assert.assertEquals("the size should be 10", 10, set.size());
    return set;
}