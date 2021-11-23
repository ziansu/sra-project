@java.lang.Override
public java.lang.String toHtmlString(final java.nio.charset.Charset charset) {
    final java.nio.charset.Charset previousCharset = super.getCharset();
    try {
        super.setCharset(charset);
        if (prependDocType) {
            final java.lang.String htmlString = new java.lang.String(super.toHtmlString(super.getCharset()).getBytes(super.getCharset()));
            return htmlString;
        }
        final java.lang.String htmlString = super.toHtmlString(super.getCharset());
        return htmlString;
    } finally {
        super.setCharset(previousCharset);
    }
}