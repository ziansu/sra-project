@java.lang.Override
public void run() {
    tw.gov.tycg.app.android.etransportation.utility.PopWindowHelper.dismissPopWindow();
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