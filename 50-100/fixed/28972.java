private void validateCustomMethods(com.blackbuild.groovy.configdsl.transform.ast.BlockStatement block) {
    warnIfUnannotatedDoValidateMethod();
    for (com.blackbuild.groovy.configdsl.transform.ast.MethodNode method : annotatedClass.getMethods()) {
        com.blackbuild.groovy.configdsl.transform.ast.AnnotationNode validateAnnotation = getAnnotation(method, com.blackbuild.groovy.configdsl.transform.ast.DSLASTTransformation.VALIDATE_ANNOTATION);
        if (validateAnnotation == null)
            continue;
        
        assertMethodIsParameterless(method);
        assertAnnotationHasNoValueOrMessage(validateAnnotation);
        block.addStatement(stmt(callX(varX("this"), method.getName())));
    }
}