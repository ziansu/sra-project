@java.lang.Override
protected void engineInit(final java.security.spec.AlgorithmParameterSpec spec) throws java.security.spec.InvalidParameterSpecException {
    if (spec instanceof javax.crypto.spec.IvParameterSpec) {
        engineInit(((javax.crypto.spec.IvParameterSpec) (spec)).getIV(), 0);
    }else {
        throw new java.security.spec.InvalidParameterSpecException();
    }
}