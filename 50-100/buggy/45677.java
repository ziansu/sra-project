@org.junit.Test
public void testParents() {
    com.puppycrawl.tools.checkstyle.checks.coding.DeclarationOrderCheck check = new com.puppycrawl.tools.checkstyle.checks.coding.DeclarationOrderCheck();
    com.puppycrawl.tools.checkstyle.api.DetailAST parent = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    parent.setType(TokenTypes.STATIC_INIT);
    com.puppycrawl.tools.checkstyle.api.DetailAST method = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    method.setType(TokenTypes.METHOD_DEF);
    parent.setFirstChild(method);
    com.puppycrawl.tools.checkstyle.api.DetailAST ctor = new com.puppycrawl.tools.checkstyle.api.DetailAST();
    ctor.setType(TokenTypes.CTOR_DEF);
    method.setNextSibling(ctor);
    check.visitToken(method);
    check.visitToken(ctor);
}