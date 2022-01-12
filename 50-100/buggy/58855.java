public static void resolveAnnotations(org.eclipse.jdt.internal.compiler.lookup.BlockScope scope, org.eclipse.jdt.internal.compiler.ast.Annotation[] sourceAnnotations, org.eclipse.jdt.internal.compiler.lookup.Binding recipient) {
    org.eclipse.jdt.internal.compiler.ast.ASTNode.resolveAnnotations(scope, sourceAnnotations, recipient, false);
    if (recipient instanceof org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding)
        ((org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding) (recipient)).evaluateNullAnnotations(scope);
    
}