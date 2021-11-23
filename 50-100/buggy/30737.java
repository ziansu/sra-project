@java.lang.Override
public void accept(com.madscientists.algoliademo.model.AlgoliaSearchResult algoliaSearchResult) throws java.lang.Exception {
    if (isAdded()) {
        handleProgressView(false);
        loadingMore = false;
        currentPageCount = algoliaSearchResult.getPage();
        if (!isPaginatedList) {
            hitsList.clear();
        }
        hitsList.addAll(algoliaSearchResult.getHits());
        adapter_searchResults.notifyDataSetChanged();
    }
}