@java.lang.Override
protected void onDestroy() {
    mPresenter.onDestroy();
    mPresenter = null;
    super.onDestroy();
}