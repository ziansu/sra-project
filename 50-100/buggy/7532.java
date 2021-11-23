@java.lang.Override
public java.lang.String toString(final boolean csv) {
    try {
        java.lang.String ret = uri.toString().replaceAll("&amp;", "&");
        ret = ret.replaceAll("&", "&amp;");
        return ret;
    } catch (final java.lang.NullPointerException e) {
    }
    return null;
}