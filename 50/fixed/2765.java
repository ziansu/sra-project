@java.lang.Override
@org.jetbrains.annotations.NotNull
public java.util.Set<org.jetbrains.kotlin.types.KotlinType> getPredictableTypes(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue key) {
    return getPredictableTypes(key, true);
}