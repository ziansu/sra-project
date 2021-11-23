@org.junit.Test
public void unknownExtTestError() {
    com.jetbrains.jetpad.vclang.module.ModuleLoader moduleLoader = new com.jetbrains.jetpad.vclang.module.ModuleLoader();
    moduleLoader.init(com.jetbrains.jetpad.vclang.module.DummySourceSupplier.getInstance(), com.jetbrains.jetpad.vclang.module.DummyOutputSupplier.getInstance(), false);
    com.jetbrains.jetpad.vclang.parser.ParserTestCase.parseDefs(moduleLoader, "\\class Point { \\function x : Nat \\function y : Nat } \\function C => Point { \\override x => 0 \\override z => 0 \\override y => 0 }", 1);
}