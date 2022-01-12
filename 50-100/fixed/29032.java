@org.junit.Test
public void testToString() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST ast = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    ast.setType(TokenTypes.LITERAL_NEW);
    ast.setColumnNo(14);
    ast.setLineNo(15);
    ast.setText("MyTest");
    final com.puppycrawl.tools.checkstyle.api.FullIdent indent = com.puppycrawl.tools.checkstyle.api.FullIdent.createFullIdent(ast);
    org.junit.Assert.assertEquals("MyTest[15x14]", indent.toString());
}