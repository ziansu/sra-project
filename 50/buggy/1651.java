@java.lang.Override
public void onRefresh() {
    swipe.setRefreshing(true);
    dm.save();
    swipe.setRefreshing(false);
}