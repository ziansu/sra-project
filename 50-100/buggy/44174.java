protected java.util.Map<java.lang.Integer, java.lang.Integer> createResizedDS(int start, int maxSize) {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = new java.util.HashMap<>();
    for (int i = start; i < maxSize; i++)
        map.put(i, i);
    
    for (int i = start + 10; i < maxSize; i++)
        map.remove(i);
    
    org.junit.Assert.assertEquals("the size should be 10", 10, map.size());
    return map;
}