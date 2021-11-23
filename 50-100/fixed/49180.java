@java.lang.Override
public void onRefresh() {
    android.util.Log.i("desc", "下啦");
    page = 0;
    if (com.zx.wfm.utils.NetWorkUtils.isNetworkConnected(getActivity())) {
        server.getTeleVisionDataFromNet(Constants.Net.CARTOON_URL);
    }else {
        refreshCompelete(swipeToLoadLayout, null);
    }
}