public java.lang.String getContentAfterLastParameter() {
    if (parameters.isEmpty()) {
        return string;
    }
    int index = getIndexAfterLastParameter();
    return string.substring(index, string.length());
}