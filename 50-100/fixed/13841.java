private java.lang.Double parseFloat() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = input.indexOf(';', index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized float!", index);
    }
    checkUnexpectedLength((delimiter + 1));
    java.lang.String value = input.substring(index, delimiter);
    index = delimiter + 1;
    return java.lang.Double.valueOf(value);
}