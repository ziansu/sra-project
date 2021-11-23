private java.lang.String getElementID(final java.lang.String relativePath) {
    java.lang.String elementID = null;
    java.lang.String topicWithelement = null;
    final java.lang.String fragment = getFragment(relativePath);
    if (fragment != null) {
        topicWithelement = getFragment(relativePath);
        if ((topicWithelement.lastIndexOf(org.dita.dost.writer.SLASH)) != (-1)) {
            elementID = topicWithelement.substring(((topicWithelement.lastIndexOf(org.dita.dost.writer.SLASH)) + 1));
        }else {
            elementID = topicWithelement;
        }
    }
    return elementID;
}