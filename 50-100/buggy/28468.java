@org.junit.Test
public void testGetResult() throws java.lang.Exception {
    java.lang.Long num1 = 10L;
    java.lang.Long num2 = 20L;
    java.lang.Long result = num1 + num2;
    com.stefanovskyi.module2.LongTask task = new com.stefanovskyi.module2.LongTask(num1, num2);
    task.execute();
    assertTrue(((task.getResult()) == result));
}