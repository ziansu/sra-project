@org.junit.Test
public void testTreeCreation() throws java.lang.Exception {
    CAS.Equation test1 = builder.makeEquation("ADD ( 4 , 5 )", 0);
    CAS.Tree<CAS.EquationObjects.MathObject> expectedTree1 = new CAS.Tree(new CAS.EquationObjects.MathObject(CAS.EquationObjects.MathOperator.ADD));
    expectedTree1.addChildWithData(new CAS.EquationObjects.MathInteger(4));
    expectedTree1.addChildWithData(new CAS.EquationObjects.MathInteger(5));
    org.junit.Assert.assertEquals(new CAS.Equation(expectedTree1), test1);
}