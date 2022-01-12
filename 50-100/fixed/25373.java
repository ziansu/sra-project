@org.junit.Test
public void testAtLeastOneNegative8() {
    java.lang.System.out.println("atLeastOneNegative");
    int n1 = -123;
    int n2 = 123;
    int n3 = 123;
    int n4 = -123;
    boolean expResult = true;
    boolean result = second.FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
    org.junit.Assert.assertEquals(expResult, result);
}