private org.codehaus.groovy.ast.ClassNode configureClass(org.eclipse.jdt.internal.compiler.lookup.BinaryTypeBinding type) {
    if ((type.id) == (org.eclipse.jdt.internal.compiler.lookup.TypeIds.T_JavaLangObject)) {
        return org.codehaus.groovy.ast.ClassHelper.OBJECT_TYPE;
    }else
        if ((type.id) == (org.eclipse.jdt.internal.compiler.lookup.TypeIds.T_JavaLangString)) {
            return org.codehaus.groovy.ast.ClassHelper.STRING_TYPE;
        }else
            if ((type.id) == (org.eclipse.jdt.internal.compiler.lookup.TypeIds.T_JavaLangClass)) {
                return org.codehaus.groovy.ast.ClassHelper.CLASS_Type;
            }
        
    
    org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode jcn = new org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode(type, resolver);
    return jcn;
}