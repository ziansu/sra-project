@java.lang.Override
public void onFailed(java.lang.String msg) {
    mCityAdapter.updateLocateState(LocateState.FAILED, null);
}