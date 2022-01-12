public static java.lang.String makeUniqueKey(int end) {
    return java.util.UUID.randomUUID().toString().toUpperCase().substring(1, (end + 1));
}