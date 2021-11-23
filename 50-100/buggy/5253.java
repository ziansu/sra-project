@java.lang.Override
public T convert(okhttp3.ResponseBody value) throws java.io.IOException {
    try {
        java.io.InputStream in = value.byteStream();
        java.lang.Class<T> c = ((java.lang.Class<T>) (type));
        return factory.deserialize(in, c, false);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}