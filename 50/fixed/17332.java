@java.lang.Override
public void onRefresh() {
    mPresenter.loadNews(1, mCategory, false);
}