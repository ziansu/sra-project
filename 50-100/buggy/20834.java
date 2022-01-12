public static java.lang.String escapeLuceneQuery(final java.lang.CharSequence text) {
    if (text == null) {
        return null;
    }
    int size = text.length();
    size = size >> 1;
    final java.lang.StringBuilder buf = new java.lang.StringBuilder(size);
    org.owasp.dependencycheck.data.lucene.LuceneUtils.appendEscapedLuceneQuery(buf, text);
    return buf.toString();
}