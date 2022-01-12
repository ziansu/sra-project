public static byte[] pmlClassTransformation(java.lang.ClassLoader loader, java.lang.String name, byte[] data, int off, int len, java.security.ProtectionDomain protectionDomain) throws java.lang.Throwable {
    try {
        data = java.util.Arrays.copyOfRange(data, off, (off + len));
        weatherpony.pml.launch.PMLRoot.transformClass(loader, name, data, protectionDomain);
        return data;
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        throw e;
    }
}