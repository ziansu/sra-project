protected <R> R newInstance(final java.lang.Class<R> instanceClass, final java.lang.Object... params) {
    try {
        return org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(instanceClass, params);
    } catch (java.lang.ReflectiveOperationException e) {
        java.lang.String msg = java.lang.String.format("Error instantiating [%s] class", org.bouncycastle.crypto.macs.HMac.class.getName());
        throw new org.apache.commons.lang3.SerializationException(msg);
    }
}