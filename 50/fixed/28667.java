@javax.annotation.Nonnull
public static java.lang.String decrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    java.lang.String result = ua.boberproduction.bbr.util.Encryption.xor(new java.lang.String(android.util.Base64.decode(message, 0)), salt);
    return result;
}