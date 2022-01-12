@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    com.orhanobut.logger.Logger.e(("There was a problem loading bus on line " + throwable));
    throwable.printStackTrace();
    vista.showLoading(false);
    if (throwable instanceof com.lowwor.realtimebus.domain.NetworkInteractor.NetworkUnavailableException) {
        vista.showOffline(true);
    }else
        if (throwable instanceof com.lowwor.realtimebus.domain.NoBusException) {
            vista.showOffline(false);
            vista.showError(com.lowwor.realtimebus.ui.track.ERROR_NO_BUS);
        }else {
            vista.showOffline(false);
        }
    
}