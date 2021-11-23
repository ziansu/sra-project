@org.junit.Test
public void testCase() {
    com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition fun = ((com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition) (com.jetbrains.jetpad.vclang.typechecking.TypeCheckingTestCase.typeCheckDef(("\\function\n" + "isZero (n : Nat) : Nat => \\case n | zero => 1 | suc _ => 0"))));
    ok(fun.getElimTree(), Nat());
}