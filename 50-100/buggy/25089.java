public static java.lang.String readValue(java.nio.CharBuffer buffer) throws java.io.IOException {
    java.lang.StringBuilder value = new java.lang.StringBuilder();
    char c;
    while ((!(java.lang.Character.isWhitespace((c = buffer.get())))) && (buffer.hasRemaining())) {
        value.append(c);
    } 
    return value.toString();
}