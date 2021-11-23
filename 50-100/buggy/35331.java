@org.junit.Test
public void testFilterAlwaysFalse() {
    java.lang.Integer[] array = new java.lang.Integer[]{ 8 , 9 , 10 , 11 , 12 };
    java.util.List<java.lang.Integer> filtered = ((java.util.List<java.lang.Integer>) (ru.spbau.mit.Collections.filter(Predicate.ALWAYS_FALSE, java.util.Arrays.asList(array))));
    org.junit.Assert.assertEquals(filtered.size(), 0);
}