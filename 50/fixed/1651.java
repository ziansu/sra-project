@java.lang.Override
public void onRefresh() {
    swipe.setRefreshing(false);
    dm.save();
}