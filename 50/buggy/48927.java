public long nextLong_Close() {
    next();
    long value = getLong(1);
    close();
    return value;
}