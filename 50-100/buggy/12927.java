@java.lang.Override
protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(final java.lang.Class<T> paramSpec) throws java.security.spec.InvalidParameterSpecException {
    if (paramSpec.equals(javax.crypto.spec.IvParameterSpec.class)) {
        return ((T) (new javax.crypto.spec.IvParameterSpec(iv, pos)));
    }else {
        throw new java.security.spec.InvalidParameterSpecException();
    }
}