@java.lang.Override
public void onValidStart() {
    mPresenter.initializeMercadoPago();
    initializeViews();
    loadViews();
    hideHeader();
    decorate();
    showTimer();
    mPresenter.loadIssuers();
}