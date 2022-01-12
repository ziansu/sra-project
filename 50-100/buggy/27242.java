private java.lang.String stripTo7Bits(java.lang.String name) {
    final int length = name.length();
    java.lang.StringBuffer result = new java.lang.StringBuffer(length);
    for (int i = 0; i < length; i++) {
        char stripped = ((char) ((name.charAt(i)) & 127));
        if (stripped != 0) {
            result.append(stripped);
        }
    }
    return result.toString();
}