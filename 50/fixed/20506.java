void writeString(java.lang.String value, int beginIndex, int endIndex) {
    if (value == null) {
        return ;
    }
    resizeBuffer(endIndex);
    buffer.replace(beginIndex, endIndex, value);
}