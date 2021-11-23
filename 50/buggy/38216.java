@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.jess.arms.base.DefaultAdapter.releaseAllHolder(mRecyclerView);
    this.mRxPermissions = null;
    this.mPaginate = null;
}