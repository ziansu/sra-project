private org.codehaus.groovy.ast.ClassNode configureSourceType(org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding type) {
    return new org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode(type, resolver);
}