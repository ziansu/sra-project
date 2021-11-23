@org.junit.Test
public void testMultiplication() throws java.lang.Exception {
    final com.example.Dollar five = new com.example.Dollar(5);
    final com.example.Dollar ten = five.times(2);
    assertEquals(10, ten.amount);
    final com.example.Dollar fifteen = five.times(3);
    assertEquals(15, fifteen.amount);
}