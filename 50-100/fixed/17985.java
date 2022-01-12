private javax.crypto.Mac getMac(com.rockaport.alice.AliceContext.MacAlgorithm macAlgorithm, char[] password) throws java.security.GeneralSecurityException {
    javax.crypto.Mac mac = javax.crypto.Mac.getInstance(macAlgorithm.toString());
    mac.init(new javax.crypto.spec.SecretKeySpec(com.rockaport.alice.Alice.toBytes(password), macAlgorithm.toString()));
    return mac;
}