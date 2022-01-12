@java.lang.Override
public java.lang.String toHtmlString(final boolean rebuild) {
    if (prependDocType) {
        return new java.lang.String((((docTypeTag) + "\n") + (super.toHtmlString(rebuild))).getBytes(getCharset()));
    }
    return super.toHtmlString(rebuild);
}