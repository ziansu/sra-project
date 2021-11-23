public void showArticle(int index) {
    initArticleView();
    com.thecoffeedrinker.theforcereader.NewsReaderContext context = com.thecoffeedrinker.theforcereader.NewsReaderContext.getInstance(getActivity());
    java.util.List<com.thecoffeedrinker.theforcereader.newsmanager.FeedNews> newsList = context.getNewsRetrieved();
    com.thecoffeedrinker.theforcereader.newsmanager.FeedNews newsToShow = newsList.get(index);
    if (((getActivity()) != null) && (Parser.Util.isNetworkAvailable(getActivity()))) {
        com.thecoffeedrinker.theforcereader.ArticleFragment.ArticleLoader HTMLloaderTask = new com.thecoffeedrinker.theforcereader.ArticleFragment.ArticleLoader();
        HTMLloaderTask.execute(newsToShow);
    }
}