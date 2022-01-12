public static void checkStringLength(java.lang.String string, int length, boolean emptyCheck) {
    java.util.Objects.requireNonNull(string);
    java.util.Objects.requireNonNull(length);
    java.util.Objects.requireNonNull(emptyCheck);
    if ((string.isEmpty()) && emptyCheck) {
        throw new java.lang.IllegalArgumentException();
    }
    if (!((string.length()) == length)) {
        throw new java.lang.IllegalArgumentException();
    }
}