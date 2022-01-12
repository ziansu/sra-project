@org.junit.Test
public void testAtLeastOneNegative4() {
    java.lang.System.out.println("atLeastOneNegative");
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = -7;
    boolean expResult = true;
    boolean result = second.FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
    org.junit.Assert.assertEquals(expResult, result);
}