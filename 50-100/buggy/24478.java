@java.lang.Override
public void onResume() {
    super.onResume();
    refreshHandler = new android.os.Handler();
    refreshHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            me.rutgersdirect.rudirect.adapter.BusStopAdapter.setExpToggleRequest(false);
            updateBusTimes();
            refreshHandler.postDelayed(this, me.rutgersdirect.rudirect.fragment.BusTimesFragment.REFRESH_INTERVAL);
        }
    }, me.rutgersdirect.rudirect.fragment.BusTimesFragment.REFRESH_INTERVAL);
    appBarLayout.addOnOffsetChangedListener(this);
}