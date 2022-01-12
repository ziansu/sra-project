@org.junit.Test
public void DocumentsWithSameContentAreEqual() throws java.lang.Exception {
    org.jsoup.nodes.Document docA = org.jsoup.Jsoup.parse("<div/>One");
    org.jsoup.nodes.Document docB = org.jsoup.Jsoup.parse("<div/>One");
    org.jsoup.nodes.Document docC = org.jsoup.Jsoup.parse("<div/>Two");
    assertEquals(docA, docB);
    assertFalse(docA.equals(docC));
    assertEquals(docA.hashCode(), docB.hashCode());
    assertFalse(((docA.hashCode()) == (docC.hashCode())));
}