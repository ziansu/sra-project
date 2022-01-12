public boolean isEmpty() {
    for (int item : array) {
        if (item != (DEFAULT_VALUE)) {
            return false;
        }
    }
    return true;
}