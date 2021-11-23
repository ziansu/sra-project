@org.junit.Test
public void removeAllOnRequiredProperty() {
    com.github.javaparser.ast.CompilationUnit cu = com.github.javaparser.JavaParser.parse("class X{ void x(){}}");
    com.github.javaparser.ast.body.MethodDeclaration methodDeclaration = cu.getType(0).getMethods().get(0);
    methodDeclaration.getName().removeForced();
    org.junit.Assert.assertEquals("class X {\n}\n", cu.toString());
}