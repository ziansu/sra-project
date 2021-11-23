@org.junit.Test
public void explore() throws java.lang.Exception {
    org.troylang.ir.compile.CompilerOptions options = org.troylang.ir.compile.CompilerOptions.DEFAULT();
    options.allowDynamicMethodAndFieldResolve = false;
    options.allowImplicitLocalVariables = false;
    org.troylang.test.ExploratoryTest.compAndRun(org.troylang.test.ExploratoryTest.fp, "prog.troy", options);
}