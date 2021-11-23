@java.lang.Override
public void onMyError(com.android.volley.VolleyError err) {
    if ((proDialog) != null) {
        proDialog.dismiss();
    }
    mPullRefreshListView.setVisibility(View.GONE);
    networkErrorLayout.setVisibility(View.VISIBLE);
}