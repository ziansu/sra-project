@java.lang.Override
public byte[] transform(java.lang.ClassLoader loader, java.lang.String className, java.lang.Class<?> classBeingRedefined, java.security.ProtectionDomain protectionDomain, byte[] classfileBuffer) throws java.lang.instrument.IllegalClassFormatException {
    try {
        return (className != null) && (className.equals(net.x11.patch.XKeysymTransformer.XNET_PROTOCOL)) ? doClass(className, classBeingRedefined, classfileBuffer) : classfileBuffer;
    } catch (java.lang.Throwable err) {
        err.printStackTrace();
        return classfileBuffer;
    }
}