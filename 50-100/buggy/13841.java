private java.lang.Double parseFloat() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = this.input.indexOf(';', this.index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized float!", this.index);
    }
    checkUnexpectedLength((delimiter + 1));
    java.lang.String value = this.input.substring(this.index, delimiter);
    this.index = delimiter + 1;
    return java.lang.Double.valueOf(value);
}