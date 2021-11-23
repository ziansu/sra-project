private static int getErrorCode(java.lang.String errorMessage) {
    int startIndex = errorMessage.indexOf(' ');
    int endIndex = (startIndex == (-1)) ? -1 : errorMessage.indexOf(startIndex, ',');
    if ((startIndex == (-1)) || (endIndex == (-1))) {
        return -1;
    }
    return java.lang.Integer.parseInt(errorMessage.substring((startIndex + 1), endIndex));
}