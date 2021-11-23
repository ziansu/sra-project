@de.jetwick.snacktory.Test
public void testSkipHidden() {
    de.jetwick.snacktory.OutputFormatter formatter = new de.jetwick.snacktory.OutputFormatter();
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse("<div><div style=\"display:none\">xy</div>test</div>");
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    formatter.appendTextSkipHidden(doc, sb, 0);
    assertEquals("test", sb.toString());
}