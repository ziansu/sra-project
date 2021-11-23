@org.junit.Test
public void substIndexEquals() {
    com.jetbrains.jetpad.vclang.term.context.binding.Binding x = new com.jetbrains.jetpad.vclang.term.context.binding.TypedBinding("x", Nat());
    com.jetbrains.jetpad.vclang.term.expr.Expression expr = Pi(Zero(), Apps(DataCall(Prelude.NAT), Reference(x)));
    org.junit.Assert.assertEquals(Pi(Zero(), Apps(DataCall(Prelude.NAT), Suc())), expr.subst(x, Suc()));
}