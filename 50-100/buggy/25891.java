private java.lang.Long parseInt() throws org.lorecraft.phparser.SerializedPhpParserException {
    int delimiter = this.input.indexOf(';', this.index);
    if (delimiter == (-1)) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized integer!", this.index);
    }
    this.checkUnexpectedLength((delimiter + 1));
    java.lang.String value = this.input.substring(this.index, delimiter);
    this.index = delimiter + 1;
    return java.lang.Long.valueOf(value);
}