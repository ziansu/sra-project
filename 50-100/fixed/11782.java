public static com.puppycrawl.tools.checkstyle.api.JavadocTagInfo fromText(final java.lang.String text) {
    if (text == null) {
        throw new java.lang.IllegalArgumentException("the text is null");
    }
    final com.puppycrawl.tools.checkstyle.api.JavadocTagInfo tag = com.puppycrawl.tools.checkstyle.api.JavadocTagInfo.TEXT_TO_TAG.get(text);
    if (tag == null) {
        throw new java.lang.IllegalArgumentException((("the text [" + text) + "] is not a valid Javadoc tag text"));
    }
    return tag;
}