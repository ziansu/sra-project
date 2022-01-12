@org.junit.Test
public void remove_emptyAfterwards() {
    com.marc.collections.SkipList<java.lang.Integer> mySkipList = new com.marc.collections.SkipList(4);
    mySkipList.add(new java.lang.Integer(5));
    mySkipList.remove(new java.lang.Integer(5));
    org.junit.Assert.assertTrue(mySkipList.isEmpty());
}