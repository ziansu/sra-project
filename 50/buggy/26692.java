@org.junit.Test
public void testTagAH() {
    wc.crawl(TestWebCrawler.tagAh, file);
    org.junit.Assert.assertEquals(2, HTMLStream.getSearchedURLs().size());
    org.junit.Assert.assertTrue(HTMLStream.getSearchedURLs().contains(TestWebCrawler.simpleLinkFound));
}