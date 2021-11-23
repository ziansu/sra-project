public void testInlineProperties() {
    com.google.javascript.jscomp.CompilerOptions options = createCompilerOptions();
    com.google.javascript.jscomp.CompilationLevel level = CompilationLevel.ADVANCED_OPTIMIZATIONS;
    level.setOptionsForCompilationLevel(options);
    level.setTypeBasedOptimizationOptions(options);
    java.lang.String code = "" + ((("var ns = {};\n" + "/** @constructor */\n") + "ns.C = function () {this.someProperty = 1}\n") + "alert(new ns.C().someProperty + new ns.C().someProperty);\n");
    assertTrue(options.shouldInlineProperties());
    assertTrue(options.collapseProperties);
    test(options, code, "alert(2);");
}