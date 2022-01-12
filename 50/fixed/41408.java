private java.util.Map<javax.lang.model.element.TypeElement, me.denley.preferencebinder.internal.BinderClassFactory> findAndParseAnnotations(javax.annotation.processing.RoundEnvironment env) {
    findAndParseDefaultFieldNames(env);
    findAndParseBindPreferenceAnnotations(env);
    findAndSetParentBinders();
    return targetClassMap;
}