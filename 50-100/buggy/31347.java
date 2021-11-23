@org.junit.Test
public void objectIdentityEqualsDoesShallowCompare1() {
    com.github.javaparser.ast.CompilationUnit x1 = com.github.javaparser.JavaParser.parse("class X{}");
    com.github.javaparser.ast.CompilationUnit x2 = com.github.javaparser.JavaParser.parse("class X{}");
    java.util.Map<com.github.javaparser.ast.CompilationUnit, java.lang.Integer> normalMap = new com.github.javaparser.utils.VisitorMap(new java.util.HashMap<>(), new com.github.javaparser.ast.visitor.ObjectIdentityHashCodeVisitor(), new com.github.javaparser.ast.visitor.ObjectIdentityEqualsVisitor());
    normalMap.put(x1, 1);
    normalMap.put(x2, 2);
    org.junit.Assert.assertEquals(2, normalMap.size());
}