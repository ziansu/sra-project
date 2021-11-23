@org.junit.Test
public void hasJavaDocCommentPositiveCaseWithSetJavaDocComment() {
    com.github.javaparser.ast.body.ClassOrInterfaceDeclaration decl = new com.github.javaparser.ast.body.ClassOrInterfaceDeclaration(java.util.EnumSet.noneOf(com.github.javaparser.ast.Modifier.class), false, "Foo");
    decl.setJavadocComment("A comment");
    org.junit.Assert.assertEquals(true, decl.hasJavaDocComment());
}