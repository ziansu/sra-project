@org.junit.Test
public void paragraphWithOneLine() {
    java.lang.String html = parseToHtml("a paragraph");
    org.junit.Assert.assertEquals(html, "<p>a paragraph</p>\n");
}