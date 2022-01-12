private java.lang.String getElementID(final java.lang.String relativePath) {
    final java.lang.String fragment = getFragment(relativePath);
    if (fragment != null) {
        if ((fragment.lastIndexOf(org.dita.dost.writer.SLASH)) != (-1)) {
            return fragment.substring(((fragment.lastIndexOf(org.dita.dost.writer.SLASH)) + 1));
        }else {
            return fragment;
        }
    }
    return null;
}