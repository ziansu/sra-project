private java.lang.Object readArray(com.cedarsoftware.util.io.JsonObject object) throws java.io.IOException {
    final java.util.Collection array = new java.util.ArrayList();
    while (true) {
        skipWhitespace();
        final java.lang.Object o = readValue(object);
        if (o != (com.cedarsoftware.util.io.JsonParser.EMPTY_ARRAY)) {
            array.add(o);
        }
        final int c = skipWhitespaceRead();
        if (c == ']') {
            break;
        }else
            if (c != ',') {
                com.cedarsoftware.util.io.JsonParser.error("Expected ',' or ']' inside array");
            }
        
    } 
    return array.toArray();
}