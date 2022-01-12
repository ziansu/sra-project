public static void main(java.lang.String[] args) {
    if (((args[1]) != null) && ((args[3]) != null)) {
        try {
            java.lang.System.out.println(("Crawling started with " + (args[1])));
            new cs454.webCrawler.webCrawler.Crawler2().crawl(args[1].trim(), java.lang.Integer.parseInt(args[3]));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    cs454.webCrawler.webCrawler.Storage.writeFile(Crawl.file1);
}