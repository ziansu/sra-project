@java.lang.Override
public void onLoadArticlesSuccessful(com.example.james_wills.nytsearch.utils.NYTSearchBuilder.SearchResult result) {
    if ((result.articles.size()) == 0) {
        showSnackbarMessage(getString(R.string.no_articles_found));
        return ;
    }
    if (page == 0) {
        adapter.replaceItems(result.articles);
        showSnackbarMessage(java.lang.String.format(getString(R.string.found_x_results), result.hits));
    }else {
        adapter.addItems(result.articles);
    }
    if ((result.isLastPage) && (!(lastPage))) {
        showSnackbarMessage(getString(R.string.no_more_results));
    }
    lastPage = result.isLastPage;
}