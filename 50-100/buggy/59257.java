public void deferConstructorCall(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.js.translate.context.ConstructorDescriptor constructor, @org.jetbrains.annotations.NotNull
java.util.List<org.jetbrains.kotlin.js.translate.context.JsExpression> invocationArgs) {
    org.jetbrains.kotlin.js.translate.context.ClassDescriptor classDescriptor = constructor.getContainingDeclaration();
    java.util.List<org.jetbrains.kotlin.js.translate.context.DeferredCallSite> callSites = staticContext.getDeferredCallSites().get(classDescriptor);
    if (callSites == null)
        throw new java.lang.IllegalStateException((("This method should be call only when `shouldBeDeferred` method " + "reports true for given constructor: ") + constructor));
    
    callSites.add(new org.jetbrains.kotlin.js.translate.context.DeferredCallSite(constructor, invocationArgs));
}