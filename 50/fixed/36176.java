@java.lang.Override
protected void onSubscribe() {
    if (com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.isViewAttached()) {
        com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.getView().showLoading(pullToRefresh);
    }
}