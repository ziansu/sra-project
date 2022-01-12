private int readLength() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = input.indexOf(':', index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Missing delimiter after string, array or object length field!", index);
    }
    checkUnexpectedLength((delimiter + 2));
    int arrayLen = java.lang.Integer.valueOf(input.substring(index, delimiter));
    index = delimiter + 2;
    return arrayLen;
}