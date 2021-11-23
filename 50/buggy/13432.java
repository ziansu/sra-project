@java.lang.Override
public void showLoading() {
    mSwipeFreshLayout.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mSwipeFreshLayout.setRefreshing(true);
        }
    });
}