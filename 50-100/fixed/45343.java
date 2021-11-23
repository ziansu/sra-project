@my.epam.collections.Test
public void iteratorShouldSupportForEachIteration() throws java.lang.Exception {
    java.lang.Integer[] expected = new java.lang.Integer[]{ 10 , 20 , 30 , 40 };
    for (java.lang.Integer value : expected) {
        list.add(value);
    }
    int i = 0;
    for (java.lang.Integer value : list) {
        assertEquals(expected[(i++)], value);
    }
}