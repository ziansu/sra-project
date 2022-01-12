private java.lang.String setAliquotFlag(java.lang.String flags, int position, java.lang.String value) {
    if (position > ((flags.length()) - 1)) {
        for (int i = (flags.length()) - 1; i < position; i++) {
            flags += "0";
        }
    }
    return ((flags.substring(0, position)) + value) + (flags.substring((position + 1)));
}