@java.lang.Override
public void onCompleted() {
    if (com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.isViewAttached()) {
        com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.getView().showContent();
    }
}