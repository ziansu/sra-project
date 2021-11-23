public static org.eclipse.jdt.core.dom.MethodDeclaration checkInvocationParentRelation(microbat.model.trace.TraceNode prevNode, microbat.model.trace.TraceNode postNode) {
    java.util.List<org.eclipse.jdt.core.dom.IMethodBinding> methodInvocationBindings = microbat.util.JavaUtil.findMethodInvocations(prevNode);
    if (!(methodInvocationBindings.isEmpty())) {
        org.eclipse.jdt.core.dom.MethodDeclaration md = microbat.util.JavaUtil.findMethodDeclaration(postNode);
        if (md == null) {
            return null;
        }
        org.eclipse.jdt.core.dom.IMethodBinding methodDeclarationBinding = md.resolveBinding();
        if (microbat.util.JavaUtil.canFindCompatibleSig(methodInvocationBindings, methodDeclarationBinding)) {
            return md;
        }
    }
    return null;
}