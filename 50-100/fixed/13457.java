@org.junit.Test
public void testmiddle6() {
    java.lang.System.out.println("middle");
    int a = 800;
    int b = 700;
    int c = 1000;
    int expResult = 800;
    int result = second.FirstTasksSet.middle(a, b, c);
    org.junit.Assert.assertEquals(expResult, result);
}