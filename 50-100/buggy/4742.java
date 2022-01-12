@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    if (me.zsj.pretty_girl.utils.NetUtils.checkNet(this)) {
        mRecyclerView.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mRefreshLayout.setRefreshing(true);
            }
        }, 350);
    }else {
        android.support.design.widget.Snackbar.make(mRecyclerView, "无网络状态不能获取美女哦!", Snackbar.LENGTH_INDEFINITE).setAction("知道了", new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
            }
        }).show();
    }
    fetchGirlData(false);
}