@javax.annotation.Nonnull
public static java.lang.String encrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    java.lang.String result = new java.lang.String(android.util.Base64.encode(ua.boberproduction.bbr.util.Encryption.xor(message, salt).getBytes(), 0));
    return result;
}