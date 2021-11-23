private boolean thereIsLinearList(java.lang.Integer[] array) {
    for (java.lang.Integer nodo : array) {
        if (nodo != 0) {
            return true;
        }
    }
    return false;
}