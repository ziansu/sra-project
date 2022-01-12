private java.lang.String setAliquotFlag(java.lang.String flags, int position, java.lang.String value) {
    if (position >= ((flags.length()) - 1)) {
        return (flags.substring(0, position)) + value;
    }else {
        return ((flags.substring(0, position)) + value) + (flags.substring((position + 1)));
    }
}