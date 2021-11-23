static java.lang.String fromCodePoint(int codePoint) {
    if (codePoint >= (java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT)) {
        char hiSurrogate = java.lang.Character.getHighSurrogate(codePoint);
        char loSurrogate = java.lang.Character.getLowSurrogate(codePoint);
        return (java.lang.String.valueOf(hiSurrogate)) + (java.lang.String.valueOf(loSurrogate));
    }else {
        return java.lang.String.valueOf(((char) (codePoint)));
    }
}