@org.junit.Test
public void testSigma() {
    com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition f = ((com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition) (typeCheckDef("\\function f (n : Nat) : \\Sigma (m : Nat) (suc n = suc m) => (n, path (\\lam (i : I) => suc n))")));
    ok(f.getElimTree(), f.getResultType());
}