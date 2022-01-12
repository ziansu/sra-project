private java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec(com.rockaport.alice.AliceContext.Mode mode, byte[] initializationVector) {
    if (((mode == null) || (initializationVector == null)) || ((initializationVector.length) <= 0)) {
        throw new java.lang.IllegalArgumentException("Mode or initialization vector is either null or empty");
    }
    switch (mode) {
        case CBC :
        case CTR :
            return new javax.crypto.spec.IvParameterSpec(initializationVector);
        case GCM :
            return new javax.crypto.spec.GCMParameterSpec(((ivLength) << 3), initializationVector);
    }
    throw new java.lang.IllegalArgumentException("Unknown mode");
}