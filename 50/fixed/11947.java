@org.junit.Test
public void getDuplicates() throws java.lang.Exception {
    assertArrayEquals("getDuplicates: non-existent file", new java.lang.String[0], org.wikipedia.WikiUnitTest.enWiki.getDuplicates("File:Sdfj&ghsld.jpg"));
}