private void fillWrappedItems(boolean hasMoreButton) {
    for (com.rocdev.guardianreader.models.Article article : articles) {
        wrappedItems.add(new com.rocdev.guardianreader.utils.ArticleAdMobRecyclerAdapter.ItemWrapper(article));
    }
    currentAdPosition = wrappedItems.size();
    wrappedItems.add(currentAdPosition, new com.rocdev.guardianreader.utils.ArticleAdMobRecyclerAdapter.ItemWrapper(adView));
    if (hasMoreButton) {
        wrappedItems.add(((currentAdPosition) + 1), new com.rocdev.guardianreader.utils.ArticleAdMobRecyclerAdapter.ItemWrapper(moreButton));
    }
}