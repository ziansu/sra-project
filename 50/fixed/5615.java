public static void setSearchWords(java.util.List<java.lang.String> searchWords) {
    com.abc.crawler.AbstractCrawler.searchWords = searchWords;
    com.abc.crawler.AbstractCrawler.searchWordsStr = com.abc.util.Util.glueSearchWords(searchWords);
}