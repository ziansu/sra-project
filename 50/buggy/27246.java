@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testThatThrowsExceptionIfUrlIsBlank() {
    new net.vidageek.crawler.PageCrawler("   \n   \t   ", this.downloader);
}