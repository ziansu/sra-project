@org.junit.Test
public void lambdas() {
    com.jetbrains.jetpad.vclang.term.context.param.DependentLink x = param("x", Nat());
    com.jetbrains.jetpad.vclang.term.context.param.DependentLink y = param("y", Nat());
    com.jetbrains.jetpad.vclang.term.expr.Expression expr1 = Lam(params(x, y), Reference(x));
    com.jetbrains.jetpad.vclang.term.expr.Expression expr2 = Lam(x, Lam(y, Reference(x)));
    assertEquals(expr1, expr2);
}