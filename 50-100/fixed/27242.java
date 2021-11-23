private java.lang.String stripTo7Bits(java.lang.String name) {
    final int length = name.length();
    java.lang.StringBuilder result = new java.lang.StringBuilder(length);
    for (int i = 0; i < length; i++) {
        char stripped = ((char) ((name.charAt(i)) & 127));
        if (stripped != 0) {
            result.append(stripped);
        }
    }
    return result.toString();
}