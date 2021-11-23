@org.junit.Test
public void get_Present() {
    com.marc.collections.SkipList<java.lang.Integer> mySkipList = new com.marc.collections.SkipList(4, new java.util.Random());
    mySkipList.add(new java.lang.Integer(5));
    mySkipList.add(new java.lang.Integer(6));
    mySkipList.add(new java.lang.Integer(8));
    mySkipList.add(new java.lang.Integer(7));
    org.junit.Assert.assertTrue(mySkipList.contains(new java.lang.Integer(6)));
}