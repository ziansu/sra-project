public static java.lang.String readValue(java.nio.CharBuffer buffer) throws java.io.IOException {
    java.lang.StringBuilder value = new java.lang.StringBuilder();
    char c;
    while (buffer.hasRemaining()) {
        c = buffer.get();
        if (java.lang.Character.isWhitespace(c))
            break;
        
        value.append(c);
    } 
    return value.toString();
}