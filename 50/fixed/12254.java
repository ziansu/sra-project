private void checkUnexpectedLength(int newIndex) throws org.lorecraft.phparser.SerializedPhpParserException {
    if (((index) > (inputLength)) || (newIndex > (inputLength))) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized Input!", index);
    }
}