public static void main(java.lang.String[] args) {
    int availableCpus = java.lang.Runtime.getRuntime().availableProcessors();
    int crawlerWorkerThreadCount = (availableCpus * 2) + 1;
    java.lang.System.out.println((((availableCpus + " processors found, using ") + crawlerWorkerThreadCount) + " worker threads for crawling"));
    org.apache.log4j.BasicConfigurator.configure();
    application.crawler.Crawler crawler = new application.crawler.Crawler(2);
    crawler.crawl();
}