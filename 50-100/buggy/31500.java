@java.lang.SuppressWarnings(value = "unchecked")
public <T extends org.gradle.language.base.internal.compile.CompileSpec> java.lang.Compiler<T> newCompiler(java.lang.Class<T> spec) {
    if (org.gradle.api.internal.tasks.compile.JavaCompileSpec.class.isAssignableFrom(spec)) {
        return ((java.lang.Compiler<T>) (new org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler(new net.ltgt.gradle.errorprone.ErrorProneCompiler(configuration))));
    }
    throw new java.lang.IllegalArgumentException(java.lang.String.format("Don't know how to compile using spec of type %s.", spec.getClass().getSimpleName()));
}