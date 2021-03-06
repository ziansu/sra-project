@java.lang.Override
public void attach(uk.co.rossbeazley.trackmytrain.android.wear.trackingScreen.ServiceView serviceView) {
    if (!(this.serviceViews.contains(serviceView))) {
        this.serviceViews.add(serviceView);
    }
    announceServiceViewAttached(serviceView);
    notificationManager.serviceViewAttached();
}