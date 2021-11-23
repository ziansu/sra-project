@org.junit.Test
public void testmiddle9() {
    java.lang.System.out.println("middle");
    int a = 700;
    int b = -1000;
    int c = -1000;
    int expResult = -1000;
    int result = second.FirstTasksSet.middle(a, b, c);
    org.junit.Assert.assertEquals(expResult, result);
}