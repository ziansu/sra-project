private void onConstructorCall(final de.javagil.columbo.api.Referrer referrer, final java.lang.Class<?> clazz, final java.lang.String name, final java.lang.String desc) {
    final java.lang.reflect.Constructor<?> constructor = findConstructor(de.javagil.columbo.internal.BytecodeUtil.rawType(clazz), desc);
    if (constructor != null) {
        referenceVisitor.onConstructorCall(referrer, constructor);
        notifyParameterTypes(referrer, constructor.getParameterTypes());
    }
}