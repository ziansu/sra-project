public java.lang.String getResponceIfMatch(java.lang.String source) {
    if (!(data.containsKey(source))) {
        return null;
    }
    return replaceRandomGroup(data.get(source));
}