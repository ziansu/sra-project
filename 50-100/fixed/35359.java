public static java.lang.String capitalize(java.lang.String str) {
    if (str.trim().isEmpty()) {
        return str;
    }
    return (str.substring(0, 1).toUpperCase()) + (str.substring(1).toLowerCase());
}