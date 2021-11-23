public <T extends org.javers.core.metamodel.type.ManagedType> T getJaversManagedType(java.lang.Class javaClass, java.lang.Class<T> expectedType) {
    org.javers.core.metamodel.type.JaversType mType = getJaversType(javaClass);
    if (expectedType.isAssignableFrom(mType.getClass())) {
        return ((T) (mType));
    }else {
        throw new org.javers.common.exception.JaversException(org.javers.common.exception.JaversExceptionCode.MANAGED_CLASS_MAPPING_ERROR, javaClass, mType.getName(), expectedType.getSimpleName());
    }
}