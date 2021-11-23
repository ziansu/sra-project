public java.lang.String parseUri(java.lang.String requestString) {
    int index1;
    int index2;
    index1 = requestString.indexOf(' ');
    if (index1 != (-1)) {
        index2 = requestString.indexOf(' ', (index1 + 1));
        if (index2 > index1) {
            return requestString.substring((index1 + 1), index2);
        }
    }
    return null;
}