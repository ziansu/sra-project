@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_execute :
            android.content.Intent intent = com.blm.hightide.activity.RelativePerformanceActivity.newIntent(this.getActivity(), this.selectedWatchlist.getId());
            startActivity(intent);
            break;
        case R.id.action_refresh :
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.blm.hightide.events.WatchlistFilesRequestStart(this.selectedWatchlist.getId(), false));
            break;
        case R.id.action_settings :
            android.util.Log.i(com.blm.hightide.fragments.WatchlistFragment.TAG, "onOptionsItemSelected: settings");
            break;
        default :
            break;
    }
    return false;
}