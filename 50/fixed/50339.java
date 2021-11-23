public int getIndexAfterLastParameter() {
    if ((parameters.length) > 0) {
        return parameters[((parameters.length) - 1)].endPosition;
    }
    return -1;
}