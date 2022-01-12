public java.lang.String format(java.lang.Object o, java.lang.String defaultIfNull) {
    if (o == null) {
        return defaultIfNull;
    }
    return format.get().format(o);
}