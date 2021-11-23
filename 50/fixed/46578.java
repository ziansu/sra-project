@org.junit.Test
public void reDeclVar2() throws java.io.IOException {
    typecheck(load(((boa.test.compiler.TestTypecheckBad.badDir) + "re-decl-var2.boa")), "variable 'i' already declared as 'int'");
}