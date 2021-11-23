public java.lang.String getContentBeforeFirstParameter() {
    if ((parameters.length) == 0) {
        return string;
    }
    int index = getIndexBeforeFirstParameter();
    return string.substring(0, index);
}