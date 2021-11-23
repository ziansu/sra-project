@java.lang.Override
public void run() {
    while ((com.zigapk.gimvic.suplence.Main.swipeRefreshLayouts[4]) == null) {
    } 
    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (android.support.v4.widget.SwipeRefreshLayout current : com.zigapk.gimvic.suplence.Main.swipeRefreshLayouts) {
                current.setRefreshing(state);
            }
            if (state)
                android.support.design.widget.Snackbar.make(com.zigapk.gimvic.suplence.Main.coordinatorLayout, R.string.refreshed, Snackbar.LENGTH_SHORT).show();
            
        }
    });
}