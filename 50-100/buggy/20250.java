boolean checkAndGrow(int by) {
    if ((((size()) - 1) + by) < (elements.length)) {
        return false;
    }
    int newSize = java.lang.Math.max(((elements.length) << 1), 1);
    elements = java.util.Arrays.copyOf(elements, ((elements.length) << 1));
    return true;
}