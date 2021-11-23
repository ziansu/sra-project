public java.lang.String getArticle(java.lang.String key) {
    java.lang.String article = null;
    java.lang.String result = null;
    if ((key != null) && ((dictMap) != null)) {
        article = dictMap.get(key);
        if (article != null) {
            result = (key + "  ") + article;
        }
    }
    return result;
}