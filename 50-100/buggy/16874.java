private void readNonEscapedValue(java.lang.StringBuilder builder) {
    if (isEnd()) {
        throw new jcsveditor.parser.CSVParseException("Unexpected End");
    }
    boolean foundComma;
    do {
        foundComma = false;
        char c = peek();
        if (c == ',') {
            foundComma = true;
        }else {
            builder.append(c);
            next();
        }
    } while ((!(isEnd())) && (!foundComma) );
}