@org.jetbrains.annotations.Nullable
protected org.jetbrains.kotlin.codegen.context.CodegenContext findChildContext(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.context.DeclarationDescriptor child) {
    return (childContexts) == null ? null : childContexts.get(child);
}