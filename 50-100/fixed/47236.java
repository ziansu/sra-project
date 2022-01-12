private void validateRange(org.terasology.math.IntegerRange range, java.lang.Integer... numbers) {
    java.util.Iterator<java.lang.Integer> iterator = range.iterator();
    for (java.lang.Integer number : numbers) {
        org.junit.Assert.assertTrue(iterator.hasNext());
        org.junit.Assert.assertEquals(number, iterator.next());
    }
    org.junit.Assert.assertFalse(iterator.hasNext());
}