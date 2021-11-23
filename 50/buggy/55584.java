@java.lang.Override
protected void onPreExecute() {
    refreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (((com.example.djordje.seeds.MainActivity) (com.example.djordje.seeds.device.Device.context)).findViewById(R.id.swiperefresh)));
    if (!(refreshLayout.isRefreshing()))
        refreshLayout.setRefreshing(true);
    
}