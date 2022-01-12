@java.lang.Override
public java.lang.String toString(final boolean csv) {
    try {
        final java.lang.String ret = uri.toString().replaceAll("&amp;", "&");
        return ret.replaceAll("&", "&amp;");
    } catch (final java.lang.NullPointerException e) {
    }
    return null;
}