@org.junit.Test
public void testSumValuesInIntegerList() {
    java.util.List<java.lang.Integer> integers = new java.util.ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(4);
    integers.add(5);
    int sum = calculator.sumItemsInListOfIntegers(integers);
    org.junit.Assert.assertEquals(sum, 15);
}