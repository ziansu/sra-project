@java.lang.Override
public java.lang.Boolean visit(final com.github.javaparser.ast.visitor.UnknownType n1, final com.github.javaparser.ast.Node arg) {
    final com.github.javaparser.ast.visitor.WildcardType n2 = ((com.github.javaparser.ast.visitor.WildcardType) (arg));
    if (!(nodesEquals(n1.getAnnotations(), n2.getAnnotations()))) {
        return java.lang.Boolean.FALSE;
    }
    return java.lang.Boolean.TRUE;
}