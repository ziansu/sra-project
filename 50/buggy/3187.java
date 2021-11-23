@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testUnaryOperatorWithOneIllegalArgument() throws java.lang.Exception {
    hu.crs.codewars.UnOp expectedAst = new hu.crs.codewars.UnOp(UnOp.Type.ARGUMENT.getValue(), 0);
    new hu.crs.codewars.Kata().pass1("[x] y");
}