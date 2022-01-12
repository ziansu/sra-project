public kotlin.jvm.internal.KFunction compute() {
    kotlin.jvm.internal.KFunction result = reflected;
    if (result == null) {
        result = kotlin.jvm.internal.Reflection.function(this);
        reflected = result;
    }
    return result;
}