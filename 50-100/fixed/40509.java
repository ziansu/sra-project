@butterknife.OnItemSelected(value = R.id.spinner_watchlist)
@java.lang.SuppressWarnings(value = "unused")
void selectWatchlist(int position) {
    if (resettingSpinner) {
        resettingSpinner = false;
        return ;
    }
    com.blm.hightide.model.Watchlist watchlist = watchlists.get(position);
    this.selectedWatchlist = watchlist;
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.blm.hightide.events.WatchlistFilesRequestStart(watchlist.getId(), true));
}