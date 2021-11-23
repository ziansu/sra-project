private boolean shouldGenerateImplicitLambda(org.eclipse.jdt.internal.compiler.lookup.BlockScope currentScope) {
    return ((this.binding.isVarargs()) || (((isConstructorReference()) && ((this.receiverType.syntheticOuterLocalVariables()) != null)) && (this.shouldCaptureInstance))) || (this.requiresBridges());
}