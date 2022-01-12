public static java.lang.String convertCharset(java.nio.charset.Charset charset) {
    java.lang.String s = charset.toString();
    int i = s.indexOf("[");
    return s.substring((i + 1), ((s.length()) - 1));
}