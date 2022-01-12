@java.lang.Override
public void onRefresh() {
    com.liangmayong.loading.Loading.showLoading(this, "开始加载数据");
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            pullRefreshLayout.setRefreshing(false);
            com.liangmayong.loading.Loading.cancelLoading(com.liangmayong.superandroid.MainActivity.this);
            setThemeColor(colorPrimary);
        }
    }, 1000);
}