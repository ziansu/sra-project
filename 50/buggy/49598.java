@java.lang.Override
public void onFailed(java.lang.String msg) {
    com.hongyu.reward.manager.LocationManager.getInstance().removeLocationListener(mGetLocationListener);
    mCityAdapter.updateLocateState(LocateState.FAILED, null);
}