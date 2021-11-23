private int readLength() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = this.input.indexOf(':', this.index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Missing delimiter after string, array or object length field!", this.index);
    }
    checkUnexpectedLength((delimiter + 2));
    int arrayLen = java.lang.Integer.valueOf(this.input.substring(this.index, delimiter));
    this.index = delimiter + 2;
    return arrayLen;
}