Concrete.ClassDefinition parseClass(java.lang.String name, java.lang.String text, int errors) {
    com.jetbrains.jetpad.vclang.parser.VcgrammarParser.StatementsContext tree = _parse(text).statements();
    com.jetbrains.jetpad.vclang.term.Concrete.ClassDefinition classDefinition = (errorList.isEmpty()) ? new com.jetbrains.jetpad.vclang.term.Concrete.ClassDefinition(com.jetbrains.jetpad.vclang.term.ConcreteExpressionFactory.POSITION, name, new com.jetbrains.jetpad.vclang.parser.BuildVisitor(com.jetbrains.jetpad.vclang.parser.ParserTestCase.SOURCE_ID, errorReporter).visitStatements(tree)) : null;
    org.junit.Assert.assertThat(errorList, containsErrors(errors));
    return classDefinition;
}