public void cache(org.oganessian.scholarly.data.objects.Article anArticle) {
    if (!(isCached(anArticle))) {
        submitAddToCacheTable(anArticle);
    }
}