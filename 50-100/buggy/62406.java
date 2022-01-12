Concrete.ClassDefinition parseClass(java.lang.String name, java.lang.String text, int errors) {
    com.jetbrains.jetpad.vclang.parser.VcgrammarParser.StatementsContext tree = com.jetbrains.jetpad.vclang.parser.ParserTestCase._parse(errorReporter, text).statements();
    java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Statement> statements = new com.jetbrains.jetpad.vclang.parser.BuildVisitor(com.jetbrains.jetpad.vclang.parser.ParserTestCase.SOURCE_ID, errorReporter).visitStatements(tree);
    com.jetbrains.jetpad.vclang.term.Concrete.ClassDefinition classDefinition = new com.jetbrains.jetpad.vclang.term.Concrete.ClassDefinition(com.jetbrains.jetpad.vclang.term.ConcreteExpressionFactory.POSITION, name, statements);
    org.junit.Assert.assertThat(errorList, containsErrors(errors));
    return classDefinition;
}