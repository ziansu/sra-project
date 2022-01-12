public static int code(java.lang.String format) {
    try {
        int index = ygoprocardmaker.enumerate.CardFormat.FORMATS.indexOf(format);
        if (index == (-1)) {
            throw new java.lang.IllegalArgumentException();
        }
        return index;
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException();
    }
}