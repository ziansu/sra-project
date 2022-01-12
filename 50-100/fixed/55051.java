@org.junit.Test
public void testMultiplication() throws java.lang.Exception {
    final com.example.Dollar five = new com.example.Dollar(5);
    assertEquals(new com.example.Dollar(10), five.times(2));
    assertEquals(new com.example.Dollar(15), five.times(3));
}