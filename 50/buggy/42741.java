public java.lang.String getContentBeforeFirstParameter() {
    if (parameters.isEmpty()) {
        return string;
    }
    int index = getIndexBeforeFirstParameter();
    return string.substring(0, index);
}