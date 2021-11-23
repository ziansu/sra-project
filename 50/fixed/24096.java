@org.junit.Test
public void parseSingleLineWithNewLines() {
    org.junit.Assert.assertEquals(new com.github.javaparser.javadoc.Javadoc(com.github.javaparser.javadoc.description.JavadocDescription.parseText("The string image of the token.")), com.github.javaparser.JavadocParser.parse(("\n" + ("   * The string image of the token.\n" + "   "))));
}