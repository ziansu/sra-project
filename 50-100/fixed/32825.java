@org.junit.Test
public void testAppProj() {
    com.jetbrains.jetpad.vclang.term.context.param.DependentLink x = param("x", Nat());
    com.jetbrains.jetpad.vclang.term.expr.Expression expr = Apps(Proj(Tuple(Sigma(param(Pi(param(Nat()), Nat()))), Lam(x, Reference(x))), 0), Zero());
    org.junit.Assert.assertEquals(Zero(), expr.normalize(NormalizeVisitor.Mode.NF));
}