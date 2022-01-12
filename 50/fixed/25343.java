@java.lang.Override
public void run() {
    for (android.support.v4.widget.SwipeRefreshLayout current : com.zigapk.gimvic.suplence.Main.swipeRefreshLayouts) {
        current.setRefreshing(state);
    }
}