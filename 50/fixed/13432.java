@java.lang.Override
public void showLoading() {
    if ((mSwipeFreshLayout) != null)
        mSwipeFreshLayout.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mSwipeFreshLayout.setRefreshing(true);
            }
        });
    
}