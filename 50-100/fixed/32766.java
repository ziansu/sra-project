@java.lang.Override
public <Arguments extends ceylon.language.Sequential<? extends java.lang.Object>> ceylon.language.Sequential<? extends ceylon.language.meta.model.FunctionModel<Type, Arguments>> getCallableConstructors(com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor reified$Arguments, @com.redhat.ceylon.compiler.java.metadata.Sequenced
ceylon.language.Sequential<? extends ceylon.language.meta.model.Type<? extends java.lang.annotation.Annotation>> annotations) {
    return getConstructors(true, true, reified$Arguments, annotations);
}