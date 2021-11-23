public static org.jetbrains.kotlin.codegen.StackValue invokeDelegatedPropertyConventionMethod(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.PropertyDescriptor propertyDescriptor, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.ExpressionCodegen codegen, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.state.KotlinTypeMapper typeMapper, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<org.jetbrains.kotlin.codegen.FunctionDescriptor> resolvedCall, final int indexInPropertyMetadataArray, int propertyMetadataArgumentIndex) {
    org.jetbrains.kotlin.codegen.StackValue.Property receiver = codegen.intermediateValueForProperty(propertyDescriptor, true, null, StackValue.LOCAL_0);
    return org.jetbrains.kotlin.codegen.PropertyCodegen.invokeDelegatedPropertyConventionMethodWithReceiver(codegen, typeMapper, resolvedCall, indexInPropertyMetadataArray, propertyMetadataArgumentIndex, receiver);
}