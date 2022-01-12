@java.lang.Override
public void onRouteFound(java.util.List<com.mybus.model.BusRouteResult> results) {
    cancelProgressDialog();
    mMyBusMap.removeChargingPointMarkers();
    if ((results == null) || (results.isEmpty())) {
        showBottomSheetResults(false);
        mViewPagerAdapter = null;
        android.widget.Toast.makeText(this, R.string.toast_no_result_found, Toast.LENGTH_LONG).show();
        return ;
    }else {
        startResultsActivity(results);
    }
}