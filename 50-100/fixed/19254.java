public static com.puppycrawl.tools.checkstyle.api.JavadocTagInfo fromName(final java.lang.String name) {
    if (name == null) {
        throw new java.lang.IllegalArgumentException("the name is null");
    }
    final com.puppycrawl.tools.checkstyle.api.JavadocTagInfo tag = com.puppycrawl.tools.checkstyle.api.JavadocTagInfo.NAME_TO_TAG.get(name);
    if (tag == null) {
        throw new java.lang.IllegalArgumentException((("the name [" + name) + "] is not a valid Javadoc tag name"));
    }
    return tag;
}