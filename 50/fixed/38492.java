private java.lang.String generateFileName() {
    return (Crawler.docCount.incrementAndGet()) + ".html";
}