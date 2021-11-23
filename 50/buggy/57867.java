public int getIndexBeforeFirstParameter() {
    if ((parameters.size()) > 0) {
        return parameters.get(0).startPosition;
    }
    return -1;
}