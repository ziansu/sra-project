public static java.io.InputStream getResourceAsStream(java.lang.Class<?> context, java.lang.String resource) {
    final java.io.InputStream in = context.getResourceAsStream(resource);
    return in == null ? io.tetrapod.core.utils.Util.class.getClass().getResourceAsStream(resource) : in;
}