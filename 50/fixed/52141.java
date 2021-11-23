public java.nio.CharBuffer get(java.lang.String fieldName) {
    int f = lineFormatMapper.getInputFormat().indexOf(fieldName);
    return get(f);
}