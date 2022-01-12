public void loadGoods(boolean pullToRefresh, long categoryId) {
    this.pullToRefresh = pullToRefresh;
    this.categoryId = categoryId;
    getView().showLoading(pullToRefresh);
    retrofit2.Call<com.antonpopoff.food.fragments.models.xml.Catalog> call = createCall();
    call.enqueue(new com.antonpopoff.food.fragments.presenters.GoodsFragmentPresenter.CatalogCallback());
}