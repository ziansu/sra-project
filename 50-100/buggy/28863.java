public void indexPage(java.lang.String url, java.util.List<org.jsoup.select.Elements> aListElements, org.jsoup.select.Elements relatedTerms) {
    java.lang.System.out.println(("Indexing " + url));
    com.flatironschool.javacs.TermCounter tc = new com.flatironschool.javacs.TermCounter(url);
    com.flatironschool.javacs.PageRanker pr = new com.flatironschool.javacs.PageRanker(url);
    for (org.jsoup.select.Elements elements : aListElements) {
        tc.processElements(elements);
    }
    pr.processElements(relatedTerms);
    pushTermCounterToRedis(tc);
    pushPageRackerToRedis(pr);
}