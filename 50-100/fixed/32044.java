public java.nio.charset.Charset charsetForEncoding(org.jcodings.Encoding encoding) {
    if (encoding.toString().equals("ASCII-8BIT")) {
        return java.nio.charset.Charset.forName("ISO-8859-1");
    }
    try {
        return java.nio.charset.Charset.forName(encoding.toString());
    } catch (java.nio.charset.UnsupportedCharsetException uce) {
        throw runtime.newEncodingCompatibilityError((("no java.nio.charset.Charset found for encoding `" + (encoding.toString())) + "'"));
    }
}