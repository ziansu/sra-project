public java.lang.Long nextLong_Close() {
    if (next()) {
        long value = getLong(1);
        close();
        return value;
    }
    return null;
}