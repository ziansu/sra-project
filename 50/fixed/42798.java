public java.lang.String nextString_Close() {
    if (next()) {
        java.lang.String value = getString(1);
        close();
        return value;
    }
    return null;
}