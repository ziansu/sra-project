private void onFieldAccess(final de.javagil.columbo.api.Referrer referrer, final java.lang.Class<?> clazz, final java.lang.String name) {
    final java.lang.reflect.Field field = findField(de.javagil.columbo.internal.BytecodeUtil.rawType(clazz), name);
    if (field != null) {
        referenceVisitor.onFieldAccess(referrer, field);
        referenceVisitor.onClassReference(referrer, de.javagil.columbo.internal.BytecodeUtil.rawType(field.getType()));
    }
}