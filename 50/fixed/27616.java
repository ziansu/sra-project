@java.lang.Override
public void onRefresh() {
    de.dhbw_loerrach.laju.Receiver receiver = new de.dhbw_loerrach.laju.Receiver(tmpfrag);
    receiver.fillInfos();
    mSwipeRefreshLayout.setRefreshing(false);
}