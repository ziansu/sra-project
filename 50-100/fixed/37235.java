private org.codehaus.groovy.ast.ClassNode configureClass(org.eclipse.jdt.internal.compiler.lookup.BinaryTypeBinding type) {
    if ((type.id) == (org.eclipse.jdt.internal.compiler.lookup.TypeIds.T_JavaLangObject)) {
        return org.codehaus.groovy.ast.ClassHelper.OBJECT_TYPE;
    }else
        if ((type.id) == (org.eclipse.jdt.internal.compiler.lookup.TypeIds.T_JavaLangString)) {
            return org.codehaus.groovy.ast.ClassHelper.STRING_TYPE;
        }
    
    return new org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode(type, resolver);
}