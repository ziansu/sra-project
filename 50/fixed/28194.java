public java.lang.Integer nextInteger_Close() {
    if (next()) {
        int value = getInteger(1);
        close();
        return value;
    }
    return null;
}