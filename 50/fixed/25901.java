public static byte[] digest(java.lang.String message, java.nio.charset.Charset charset, java.lang.String algorithm) throws org.omnifaces.utils.security.UncheckedNoSuchAlgorithmException {
    return org.omnifaces.utils.security.MessageDigests.digest(message.getBytes(charset), algorithm);
}