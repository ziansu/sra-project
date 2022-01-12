@org.junit.Test
public void get_NotPresent() {
    com.marc.collections.SkipList<java.lang.Integer> mySkipList = new com.marc.collections.SkipList(4);
    mySkipList.add(new java.lang.Integer(5));
    mySkipList.add(new java.lang.Integer(6));
    mySkipList.add(new java.lang.Integer(10));
    mySkipList.add(new java.lang.Integer(7));
    org.junit.Assert.assertFalse(mySkipList.contains(new java.lang.Integer(8)));
}