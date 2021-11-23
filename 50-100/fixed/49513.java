private java.lang.Long parseInt() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = input.indexOf(';', index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized integer!", index);
    }
    checkUnexpectedLength((delimiter + 1));
    java.lang.String value = input.substring(index, delimiter);
    index = delimiter + 1;
    return java.lang.Long.valueOf(value);
}