@org.junit.Test
public void parseCommentWithNewLines() {
    java.lang.String text = "\n" + ((("   * The version identifier for this Serializable class.\n" + "   * Increment only if the <i>serialized</i> form of the\n") + "   * class changes.\n") + "   ");
    org.junit.Assert.assertEquals(new com.github.javaparser.javadoc.Javadoc(com.github.javaparser.javadoc.description.JavadocDescription.parseText(("The version identifier for this Serializable class.\n" + ("Increment only if the <i>serialized</i> form of the\n" + "class changes.")))), new com.github.javaparser.JavadocParser().parse(text));
}