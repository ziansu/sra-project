@org.junit.Test
public void testMinOrMax5() {
    java.lang.System.out.println("minOrMax");
    boolean min = true;
    int n1 = 987;
    int n2 = -9;
    int n3 = 5123;
    int expResult = 5123;
    int result = second.FirstTasksSet.minOrMax(min, n1, n2, n3);
    org.junit.Assert.assertEquals(expResult, result);
}