@java.lang.SuppressWarnings(value = "WeakerAccess")
public static javax.crypto.Mac getMac(com.rockaport.alice.AliceContext.MacAlgorithm macAlgorithm, char[] password) throws java.security.GeneralSecurityException {
    if (macAlgorithm == null) {
        throw new java.lang.IllegalArgumentException("Algorithm is null");
    }
    if ((password == null) || ((password.length) == 0)) {
        throw new java.lang.IllegalArgumentException("Password is null or empty");
    }
    javax.crypto.Mac mac = javax.crypto.Mac.getInstance(macAlgorithm.toString());
    mac.init(new javax.crypto.spec.SecretKeySpec(com.rockaport.alice.Alice.toBytes(password), macAlgorithm.toString()));
    return mac;
}