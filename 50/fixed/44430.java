@org.junit.Test
public void parseSingleLineWithSpacing() {
    org.junit.Assert.assertEquals(new com.github.javaparser.javadoc.Javadoc(com.github.javaparser.javadoc.description.JavadocDescription.parseText("The line number of the first character of this Token.")), com.github.javaparser.JavadocParser.parse(" The line number of the first character of this Token. "));
}