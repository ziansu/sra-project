@java.lang.Override
@org.jetbrains.annotations.NotNull
public java.util.Set<org.jetbrains.kotlin.types.KotlinType> getPredictableTypes(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue key) {
    if (!(key.isPredictable())) {
        return new java.util.LinkedHashSet<org.jetbrains.kotlin.types.KotlinType>();
    }
    return getPossibleTypes(key);
}