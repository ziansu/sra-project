@org.junit.Test
public void testSomePositive3() {
    java.lang.System.out.println("somePositive");
    java.lang.String input = "1 2 3 4 5 6 7 8 9 0";
    boolean expResult = true;
    boolean result = second.FirstTasksSet.somePositive(input);
    org.junit.Assert.assertEquals(expResult, result);
}