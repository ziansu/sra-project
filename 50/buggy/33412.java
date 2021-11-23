private java.lang.Integer getLeftKey(java.lang.Integer key) {
    java.lang.Integer leftKey = key - 1;
    if (leftKey <= 0) {
        return null;
    }
    return leftKey;
}