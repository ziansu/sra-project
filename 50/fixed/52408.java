@calc.Test
public void testDiv() throws java.lang.Exception {
    int resoult = calc.div(5, 5);
    int exp = 1;
    junit.framework.TestCase.assertEquals(resoult, exp);
}