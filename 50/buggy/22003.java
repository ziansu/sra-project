@java.lang.Override
public void onMyError(com.android.volley.VolleyError err) {
    com.swjtu.walker.utils.L.v(com.swjtu.walker.activity.home.TAG, "请求失败");
    if ((proDialog) != null) {
        proDialog.dismiss();
    }
    mPullRefreshListView.setVisibility(View.GONE);
    networkErrorLayout.setVisibility(View.VISIBLE);
}