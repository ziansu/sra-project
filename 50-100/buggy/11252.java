@java.lang.Override
public void onRefresh() {
    if (it.asg.hustle.Utils.CheckConnection.isConnected(getActivity())) {
        android.util.Log.d("HUSTLE", ("refresh on " + (tabPosition)));
        downloadFriendShows(gridAdapter[tabPosition], true);
    }else {
        android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.toast_failure_refresh), Toast.LENGTH_SHORT).show();
        swipeView.setRefreshing(false);
    }
}