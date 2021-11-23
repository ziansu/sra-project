@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if (mWaitingForReconnect) {
        mWaitingForReconnect = false;
    }else
        if (((mSessionId) != null) && ((mRouteInfo) != null)) {
            joinSession();
        }else {
            newSession();
        }
    
    updateControlViews(true);
}