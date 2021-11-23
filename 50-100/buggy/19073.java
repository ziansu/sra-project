@org.junit.Test
public void returnStatement() {
    assertEquals(0, run(b.setLocalVariable(0, "x", b.zero()), b.return_($x), b.localVariableAssignOp(0, "x", "plus", b.one()), b.plus(0, $x, $y)));
}