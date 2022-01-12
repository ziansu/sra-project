@org.junit.Test
public void testEntrySet() {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = this.createResizedDS();
    java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> entrySet = map.entrySet();
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "{0=0, 2=2, 3=3, 4=4, 5=5, 6=6, 7=7, 8=8, 9=9}", entrySet.toString());
    this.assertEqualstUnordered("The strings are not a permutation of each other", "{0=0, 1=1, 2=2, 3=3, 4=4, 5=5, 6=6, 7=7, 8=8, 9=9}", entrySet.toString());
}