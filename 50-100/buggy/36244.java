private void createStaticLookupMethod(org.codehaus.groovy.ast.ClassNode classNode, org.codehaus.groovy.ast.ClassNode implementationNode, java.lang.String apiInstanceProperty, java.lang.String lookupMethodName) {
    org.codehaus.groovy.ast.MethodNode lookupMethod = classNode.getMethod(lookupMethodName, org.codehaus.groovy.grails.compiler.injection.ZERO_PARAMETERS);
    if (lookupMethod == null) {
        org.codehaus.groovy.ast.stmt.BlockStatement methodBody = new org.codehaus.groovy.ast.stmt.BlockStatement();
        lookupMethod = populateAutowiredApiLookupMethod(implementationNode, apiInstanceProperty, lookupMethodName, methodBody);
        classNode.addMethod(lookupMethod);
    }
}