public org.lucylang.ljvm.value.Value runLy(java.lang.String src) throws java.lang.Exception {
    java.io.Reader r = new java.io.InputStreamReader(new java.io.FileInputStream(src), "UTF8");
    org.lucylang.ljvm.parser.Parser parser = new org.lucylang.ljvm.parser.Parser();
    org.lucylang.ljvm.machine.module.Module module = parser.parseModule(new org.lucylang.ljvm.driver.Lexer(r));
    org.lucylang.ljvm.generator.ModuleCodeGenerator codeGenerator = new org.lucylang.ljvm.generator.ModuleCodeGenerator();
    org.lucylang.ljvm.machine.module.Module m = codeGenerator.visitModule(module);
    return this.initVM().execute(m);
}