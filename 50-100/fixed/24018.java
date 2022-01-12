@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().getActionBar().setTitle(R.string.title_nearby_beacons);
    getActivity().getActionBar().setDisplayHomeAsUpEnabled(false);
    if ((mFirstTime) && (!(mMainActivity.isCheckingPermissions()))) {
        restartScan();
    }
    mFirstTime = false;
}