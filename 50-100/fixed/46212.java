private org.springframework.security.saml.key.KeyManager keyManager() {
    org.springframework.core.io.DefaultResourceLoader loader = new org.springframework.core.io.DefaultResourceLoader();
    org.springframework.core.io.Resource storeFile = loader.getResource(keystorePath);
    java.util.Map<java.lang.String, java.lang.String> passwords = new java.util.HashMap<>();
    passwords.put(defaultKey, defaultKeyPass);
    return new org.springframework.security.saml.key.JKSKeyManager(storeFile, storePass, passwords, defaultKey);
}