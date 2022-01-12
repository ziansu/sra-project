@org.junit.Test
public void parseSimplestContent() {
    org.junit.Assert.assertEquals(new com.github.javaparser.javadoc.Javadoc(com.github.javaparser.javadoc.description.JavadocDescription.parseText("A simple line of text")), com.github.javaparser.JavadocParser.parse("A simple line of text"));
}