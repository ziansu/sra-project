public static com.booboot.vndbandroid.model.vndbandroid.ProgressiveResultLoaderOptions build(com.booboot.vndbandroid.factory.ProgressiveResultLoader progressiveResultLoader) {
    if (progressiveResultLoader == null)
        return null;
    
    com.booboot.vndbandroid.model.vndbandroid.ProgressiveResultLoaderOptions options = new com.booboot.vndbandroid.model.vndbandroid.ProgressiveResultLoaderOptions();
    options.cards = progressiveResultLoader.getCards();
    if (options.cards.isEmpty())
        return null;
    
    options.currentPage = progressiveResultLoader.getCurrentPage();
    options.moreResults = progressiveResultLoader.isMoreResults();
    return options;
}