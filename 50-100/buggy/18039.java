private static boolean forceBoxedReturnType(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.state.FunctionDescriptor descriptor) {
    if (!(org.jetbrains.kotlin.builtins.KotlinBuiltIns.isPrimitiveType(descriptor.getReturnType())))
        return false;
    
    for (org.jetbrains.kotlin.codegen.state.FunctionDescriptor overridden : getAllOverriddenDescriptors(descriptor)) {
        if (!(org.jetbrains.kotlin.builtins.KotlinBuiltIns.isPrimitiveType(overridden.getOriginal().getReturnType())))
            return true;
        
    }
    return false;
}