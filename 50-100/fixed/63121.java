@java.lang.Override
public void onCompleted(java.lang.Exception e, java.lang.String result) {
    if (e != null) {
        listener.latestBuoyFetchFailed();
        return ;
    }
    com.nucc.hackwinds.types.Buoy latestBuoy = parseBuoyData(result);
    if (latestBuoy != null) {
        listener.latestBuoyFetchSuccess(latestBuoy);
    }else {
        listener.latestBuoyFetchFailed();
    }
}