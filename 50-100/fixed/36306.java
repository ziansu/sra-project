public void onDestroy() {
    if ((presenter) == null)
        return ;
    
    presenter.detachView();
    if (!(callbacks.isRetainPresenter())) {
        presenterStore.remove(callbacks.getPresenterUniqueKey());
        presenter.onDestroy();
    }
    presenter = null;
}