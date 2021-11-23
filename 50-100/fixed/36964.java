public java.lang.String getName() {
    if (!(className.contains("."))) {
        return className;
    }
    java.lang.String[] parts = className.split("\\.");
    return parts[((parts.length) - 1)];
}