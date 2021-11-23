@org.junit.Test
public void testImproperToken() {
    com.puppycrawl.tools.checkstyle.checks.coding.DeclarationOrderCheck check = new com.puppycrawl.tools.checkstyle.checks.coding.DeclarationOrderCheck();
    com.puppycrawl.tools.checkstyle.api.DetailAST parent = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    parent.setType(TokenTypes.STATIC_INIT);
    com.puppycrawl.tools.checkstyle.api.DetailAST array = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    array.setType(TokenTypes.ARRAY_INIT);
    parent.setFirstChild(array);
    check.visitToken(array);
}