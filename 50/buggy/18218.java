private java.lang.Integer getTopKey(java.lang.Integer key) {
    java.lang.Integer topKey = key - (n);
    if (topKey <= 0) {
        return null;
    }
    return topKey;
}