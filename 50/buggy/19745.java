@java.lang.Override
public void onResume() {
    super.onResume();
    mPresenter.clearEditListeners();
    mPresenter.clearEditItemCache(mItemId);
    mPresenter.editItem(mItemId);
}