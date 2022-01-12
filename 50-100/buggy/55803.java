@org.junit.Test
public void testSecondTermMissing() {
    java.util.ArrayList<java.lang.Integer> arrayList = test.Test_4a.invertedIndex.performANDNOTMerge("tiberius", "marcus");
    java.util.Collections.sort(arrayList);
    java.lang.Integer[] array = arrayList.toArray(new java.lang.Integer[arrayList.size()]);
    org.junit.Assert.assertArrayEquals(new java.lang.Integer[]{ 1 }, array);
}