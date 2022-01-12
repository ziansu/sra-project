@java.lang.Override
public T convert(java.lang.String source) throws org.structr.common.error.FrameworkException {
    if (source != null) {
        try {
            return ((T) (java.lang.Enum.valueOf(enumType, source)));
        } catch (java.lang.Throwable t) {
            throw new org.structr.common.error.FrameworkException(declaringClass.getSimpleName(), new org.structr.common.error.ValueToken(this, enumType.getEnumConstants()));
        }
    }
    return null;
}