public java.lang.String crawl(boolean testing) throws java.io.IOException {
    if (queue.isEmpty()) {
        return null;
    }
    java.lang.String s = queue.poll();
    org.jsoup.select.Elements e;
    if (testing) {
        e = com.flatironschool.javacs.WikiCrawler.wf.readWikipedia(s);
    }else {
        while (index.isIndexed(s)) {
            s = queue.poll();
        } 
        e = com.flatironschool.javacs.WikiCrawler.wf.fetchWikipedia(s);
    }
    index.indexPage(s, e);
    queueInternalLinks(e);
    return s;
}