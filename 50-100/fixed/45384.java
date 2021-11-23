public java.lang.reflect.Method getGetterMethod() {
    initializeTransientMembersFromPrototype();
    if ((getterMethod) == null) {
        getterMethod = findPropertyAccessor(propertyName, ReflectionUtil.GETTER_PREFIX);
        if ((getterMethod) == null) {
            getterMethod = findPropertyAccessor(propertyName, ReflectionUtil.BOOLEAN_GETTER_PREFIX);
        }
        if ((getterMethod) == null)
            getterMethod = org.nocket.gen.page.element.synchronizer.SynchronizerHelper.NULL_METHOD;
        
    }
    return nullableMethod(getterMethod);
}