@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testUnaryOperatorWithOneIllegalArgument() throws java.lang.Exception {
    new hu.crs.codewars.Kata().pass1("[x] y");
}