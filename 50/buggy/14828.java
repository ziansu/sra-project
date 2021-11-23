public void request(boolean loadMore) {
    if (!loadMore)
        after = null;
    
    view.showLoading();
    interactor.list(after, limit, rowJson, service, this);
}