@org.junit.Test
public void iteratorShouldSupportForEachIteration() throws java.lang.Exception {
    int[] expected = new int[]{ 10 , 20 , 30 , 40 };
    for (int i : expected) {
        list.add(expected[i]);
    }
    int i = 0;
    for (java.lang.Integer value : list) {
        assertEquals(new java.lang.Integer(expected[(i++)]), value);
    }
}