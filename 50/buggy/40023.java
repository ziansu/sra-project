private kotlin.jvm.internal.KFunction getReflected() {
    compute();
    if ((reflected) == (this)) {
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }
    return reflected;
}