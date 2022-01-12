private void resolvePropertyAccessor(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.BodiesResolveContext c, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.ObservableBindingTrace fieldAccessTrackingTrace, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.PropertyDescriptor propertyDescriptor, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.JetPropertyAccessor accessor, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.PropertyAccessorDescriptor accessorDescriptor) {
    org.jetbrains.kotlin.resolve.scopes.LexicalScope accessorScope = makeScopeForPropertyAccessor(c, accessor, propertyDescriptor);
    org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil.forceResolveAllContents(accessorDescriptor.getAnnotations());
    PreliminaryDeclarationVisitor.Companion.visitDeclaration(accessor, accessorDescriptor, fieldAccessTrackingTrace);
    resolveFunctionBody(c.getOuterDataFlowInfo(), fieldAccessTrackingTrace, accessor, accessorDescriptor, accessorScope);
}