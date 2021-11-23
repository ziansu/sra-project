@org.junit.Test
public void testInterpreterContexDivision() {
    edu.kit.iti.formal.pse.worthwhile.interpreter.Interpreter interpreter = new edu.kit.iti.formal.pse.worthwhile.interpreter.Interpreter(edu.kit.iti.formal.pse.worthwhile.common.tests.TestASTProvider.getRootASTNode("Integer a := 84 / 2\n"));
    assertNotNull(interpreter);
    interpreter.execute();
    edu.kit.iti.formal.pse.worthwhile.interpreter.Value value = new edu.kit.iti.formal.pse.worthwhile.interpreter.Value(new java.math.BigInteger("42"));
    assertEquals(value, interpreter.getSymbol("a"));
}