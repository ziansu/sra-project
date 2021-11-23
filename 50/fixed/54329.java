@java.lang.Override
public void onLoading() {
    android.util.Log.i("onLoading", ("category:" + (category)));
    swipeRefresh.setRefreshing(true);
}