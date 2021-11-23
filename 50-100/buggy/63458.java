protected static org.springframework.security.saml.key.KeyManager keyManager() {
    org.springframework.core.io.DefaultResourceLoader loader = new org.springframework.core.io.DefaultResourceLoader();
    org.springframework.core.io.Resource storeFile = loader.getResource("classpath:/saml/colombia.jks");
    java.util.Map<java.lang.String, java.lang.String> passwords = new java.util.HashMap<>();
    passwords.put("colombia", "colombia-password");
    java.lang.String defaultKey = "colombia";
    return new org.springframework.security.saml.key.JKSKeyManager(storeFile, "colombia-password", passwords, defaultKey);
}