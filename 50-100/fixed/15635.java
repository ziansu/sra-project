private java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec(com.rockaport.alice.AliceContext.Mode mode, byte[] initializationVector) {
    switch (mode) {
        case CBC :
        case CTR :
            return new javax.crypto.spec.IvParameterSpec(initializationVector);
        case GCM :
            return new javax.crypto.spec.GCMParameterSpec(((ivLength) << 3), initializationVector);
    }
    throw new java.lang.IllegalArgumentException("Unknown mode");
}