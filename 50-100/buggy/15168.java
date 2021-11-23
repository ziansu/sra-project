public static java.lang.String createSharedString(char[] chars, int newLength) {
    if (((io.netty.util.internal.PlatformDependent.hasUnsafe()) && (io.netty.util.internal.PlatformDependent0.hasSecretAccess())) && ((io.netty.util.internal.PlatformDependent.javaVersion()) >= 8)) {
        if ((chars.length) == newLength) {
            return io.netty.util.internal.PlatformDependent0.createSharedString(chars);
        }else {
            return io.netty.util.internal.PlatformDependent.createCopiedString(chars, newLength);
        }
    }else {
        return new java.lang.String(chars, 0, newLength);
    }
}