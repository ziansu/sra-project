@java.lang.Override
public void onRefresh() {
    mPage = START_PAGE;
    if (!(android.text.TextUtils.isEmpty(mKey))) {
        mPresenter.searchCollections(mKey, mPage, com.masker.discover.search.fragment.SearchCollectionFragment.PER_PAGE);
    }else {
        mRefreshLayout.setRefreshing(false);
    }
}