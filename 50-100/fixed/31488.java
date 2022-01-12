private static org.codehaus.groovy.grails.compiler.injection.ThrowStatement createMissingMethodThrowable(org.codehaus.groovy.grails.compiler.injection.ClassNode classNode, org.codehaus.groovy.grails.compiler.injection.MethodNode declaredMethodNode) {
    org.codehaus.groovy.grails.compiler.injection.ArgumentListExpression exceptionArgs = new org.codehaus.groovy.grails.compiler.injection.ArgumentListExpression();
    exceptionArgs.addExpression(new org.codehaus.groovy.grails.compiler.injection.ConstantExpression(declaredMethodNode.getName()));
    exceptionArgs.addExpression(new org.codehaus.groovy.grails.compiler.injection.ClassExpression(classNode));
    return new org.codehaus.groovy.grails.compiler.injection.ThrowStatement(new org.codehaus.groovy.grails.compiler.injection.ConstructorCallExpression(org.codehaus.groovy.grails.compiler.injection.GrailsASTUtils.MISSING_METHOD_EXCEPTION, exceptionArgs));
}