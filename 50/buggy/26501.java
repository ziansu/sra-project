@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onPoisAndNotesDownloadedEvent(io.mapsquare.osmcontributor.core.events.PoisAndNotesDownloadedEvent event) {
    android.util.Log.i(io.mapsquare.osmcontributor.map.MapFragmentPresenter.class.getSimpleName(), "onPoisAndNotesDownloadedEvent: ");
    mapFragment.showProgressBar(false);
    forceRefreshPoi = true;
    loadPoisIfNeeded();
}