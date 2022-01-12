@org.junit.Test
public void testmin6() {
    java.lang.System.out.println("min");
    int a = 700;
    int b = 700;
    int c = 1000;
    int expResult = 700;
    int result = second.FirstTasksSet.min(a, b, c);
    org.junit.Assert.assertEquals(expResult, result);
}