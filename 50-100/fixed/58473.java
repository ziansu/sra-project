@org.junit.Test
public void minReducerWorksCorrectlyWithIntegerNumbers() {
    io.datakernel.jmx.JmxReducerMin minReducer = new io.datakernel.jmx.JmxReducerMin();
    java.util.List<java.lang.Integer> numbers = new java.util.ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(10);
    int result = ((int) (minReducer.reduce(numbers)));
    org.junit.Assert.assertEquals(2, result);
}