public void createCrawlers() {
    pool = new CrawlPool();
    pool.initCrawlers();
    WebCrawler.urlCount = 0;
    WebCrawler.exit = 0;
}