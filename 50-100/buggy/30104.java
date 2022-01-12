private void updateDataThenSetList(final java.lang.String goBack) {
    tw.gov.tycg.app.android.etransportation.web.WebAgent.stopRetryThread();
    tw.gov.tycg.app.android.etransportation.utility.PopWindowHelper.dismissPopWindow();
    refreshHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            showLoadingWindow();
            tw.gov.tycg.app.android.etransportation.model.DataArray.getBusRealTimeData(stopPair[0], new tw.gov.tycg.app.android.etransportation.model.DataArray.OnDataGetCallBack() {
                @java.lang.Override
                public void onDataGet(java.lang.Object dataItems) {
                    if (isFirstTimeRun)
                        initBusLineTabAndSetName();
                    else
                        setBusRealTimeListByGoOrBack(goBack);
                    
                    tw.gov.tycg.app.android.etransportation.utility.PopWindowHelper.dismissPopWindow();
                    stopReceive();
                }
            });
        }
    });
}