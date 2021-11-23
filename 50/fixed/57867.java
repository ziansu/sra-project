public int getIndexBeforeFirstParameter() {
    if ((parameters.length) > 0) {
        return parameters[0].startPosition;
    }
    return -1;
}