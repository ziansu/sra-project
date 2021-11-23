@java.lang.Override
public java.lang.String decode(byte[] data) throws java.lang.Exception {
    return new java.lang.String(data, java.nio.charset.Charset.forName("UTF-8"));
}