public java.lang.reflect.Method getRemoverButtonMethod() {
    initializeTransientMembersFromPrototype();
    if ((removerButtonMethod) == null) {
        if (propertyName.startsWith(ReflectionUtil.REMOVER_PREFIX)) {
            removerButtonMethod = getButtonMethod();
        }else {
            removerButtonMethod = findPropertyAccessor(propertyName, ReflectionUtil.REMOVER_PREFIX);
        }
        if ((removerButtonMethod) == null)
            removerButtonMethod = org.nocket.gen.page.element.synchronizer.SynchronizerHelper.NULL_METHOD;
        
    }
    return nullableMethod(removerButtonMethod);
}