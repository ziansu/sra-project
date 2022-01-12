public static java.lang.String escapeLuceneQuery(final java.lang.CharSequence text) {
    if (text == null) {
        return null;
    }
    final int size = (text.length()) << 1;
    final java.lang.StringBuilder buf = new java.lang.StringBuilder(size);
    org.owasp.dependencycheck.data.lucene.LuceneUtils.appendEscapedLuceneQuery(buf, text);
    return buf.toString();
}