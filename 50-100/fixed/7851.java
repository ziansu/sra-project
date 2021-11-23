@org.junit.Test
public void addAndRemoveTest() {
    java.util.Collections.addAll(mySet, 1, 2, 3);
    java.util.Collections.addAll(anotherSet, 1, 3, 4);
    mySet.add(4);
    mySet.remove(2);
    org.junit.Assert.assertTrue(anotherSet.equals(mySet));
    org.junit.Assert.assertEquals(anotherSet, mySet);
}