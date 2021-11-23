public com.tianbin.youdaospider.model.Wordbook fetchWords(java.lang.String cookie) throws java.io.IOException {
    com.tianbin.youdaospider.model.Wordbook youDaoWordbook = new com.tianbin.youdaospider.model.Wordbook();
    java.util.Map<java.lang.String, java.lang.String> cookieMap = getCookieMap(cookie);
    org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect(YouDaoURL.WORD_LIST_URL).headers(mHeaderMap).cookies(cookieMap).get();
    youDaoWordbook.wordCount = getWordCount(document);
    youDaoWordbook.pageCount = getPageCount(document);
    parseWords(youDaoWordbook.pageCount, youDaoWordbook, cookieMap);
    return youDaoWordbook;
}