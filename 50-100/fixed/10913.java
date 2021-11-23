private void showCompleteBusRouteGoing(int busLineId, java.lang.String busLineName) {
    mBusLineId = busLineId;
    mGoingSwitch.setChecked(false);
    mToolbar.setVisibility(View.GONE);
    mGoingAndReturnLayout.setVisibility(View.VISIBLE);
    if (mMyBusMap.completeRouteExists(busLineId)) {
        mMyBusMap.showCompleteRouteGoing(busLineId);
        mMyBusMap.zoomOutCompleteBusRouteGoing(busLineId);
    }else {
        showProgressDialog(getString(R.string.searching_complete_route));
        com.mybus.service.ServiceFacade.getInstance().getCompleteBusRoute(busLineId, busLineName, this);
    }
}