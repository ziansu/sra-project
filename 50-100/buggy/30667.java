public static java.lang.String convert(java.lang.String source, java.nio.charset.Charset srcCharset, java.nio.charset.Charset destCharset) {
    if (null == srcCharset) {
        srcCharset = java.nio.charset.StandardCharsets.ISO_8859_1;
    }
    if (null == destCharset) {
        srcCharset = java.nio.charset.StandardCharsets.UTF_8;
    }
    if ((com.xiaoleilu.hutool.util.StrUtil.isBlank(source)) || (srcCharset.equals(destCharset))) {
        return source;
    }
    return new java.lang.String(source.getBytes(srcCharset), destCharset);
}