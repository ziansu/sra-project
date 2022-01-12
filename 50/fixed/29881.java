public java.lang.String getContentAfterLastParameter() {
    if ((parameters.length) == 0) {
        return string;
    }
    int index = getIndexAfterLastParameter();
    return string.substring(index, string.length());
}