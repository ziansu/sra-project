@java.lang.Override
public byte[] transform(final java.lang.ClassLoader loader, final java.lang.String className, final java.lang.Class<?> classBeingRedefined, final java.security.ProtectionDomain protectionDomain, final byte[] classfileBuffer) throws java.lang.instrument.IllegalClassFormatException {
    if (skip(loader, className)) {
        return null;
    }
    try {
        return instrumenter.instrument(classfileBuffer, className);
    } catch (final java.io.IOException e) {
        final java.lang.instrument.IllegalClassFormatException ex = new java.lang.instrument.IllegalClassFormatException(e.getMessage());
        ex.initCause(ex);
        throw ex;
    }
}