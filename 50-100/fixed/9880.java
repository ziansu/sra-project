private static java.lang.Class<?> forName(final java.lang.String directory, final java.lang.String name) {
    try {
        final java.lang.Class<?> cls = org.obicere.cc.util.Reflection.LOADER.loadClass(name);
        if (cls != null) {
            return cls;
        }
    } catch (final java.lang.Throwable ignored) {
    }
    return org.obicere.cc.util.Reflection.DEFINER.attemptDefine(directory, name);
}