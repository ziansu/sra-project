public java.lang.String getArticle(java.lang.String key) {
    java.lang.String article = null;
    java.lang.String result = null;
    if ((key != null) && ((dictMap) != null)) {
        article = (((key + "  ") + (dictMap.get(key))) != null) ? dictMap.get(key) : "Article no found";
    }
    return article;
}