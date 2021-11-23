public static java.lang.String createSharedString(char[] chars) {
    if (((io.netty.util.internal.PlatformDependent.hasUnsafe()) && (io.netty.util.internal.PlatformDependent0.hasSecretAccess())) && ((io.netty.util.internal.PlatformDependent.javaVersion()) >= 8)) {
        return io.netty.util.internal.PlatformDependent0.createSharedString(chars);
    }else {
        return new java.lang.String(chars);
    }
}