void writeString(java.lang.String value, int beginIndex, int endIndex) {
    if (value == null) {
        return ;
    }
    resizeBuffer((endIndex + 1));
    buffer.replace(beginIndex, endIndex, value);
}