@java.lang.Override
public void onResume() {
    super.onResume();
    mPresenter.editItem(mItemId);
}