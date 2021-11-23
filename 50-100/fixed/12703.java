public static final sune.util.ssdf2.SSDCollection read(java.lang.String content) {
    if (content == null) {
        throw new java.lang.IllegalArgumentException("Content cannot be null!");
    }
    char[] chars = sune.util.ssdf2.SSDF.format(content.toCharArray());
    return sune.util.ssdf2.SSDF.readObjects(chars, 0, chars.length);
}