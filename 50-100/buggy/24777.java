@org.junit.Test
public void blockScopedVariable() {
    assertEquals(0, run(b.if_(b.true_(), b.sequence(b.declareVariable(int.class, "x"), b.setLocalVariable(0, "x", b.one()))), b.declareVariable(int.class, "x"), b.return_($x)));
}