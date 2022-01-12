@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((find.service.net.diogomarques.wifioppish.service.LOSTService.environment) != null) {
        android.util.Log.i(find.service.net.diogomarques.wifioppish.service.LOSTService.TAG, "Stopped looped");
        find.service.net.diogomarques.wifioppish.service.LOSTService.environment.stopStateLoop();
        find.service.net.diogomarques.wifioppish.service.LOSTService.environment = null;
        find.service.net.diogomarques.wifioppish.service.LOSTService.serviceActive = false;
    }
    stopSelf();
    android.util.Log.i(find.service.net.diogomarques.wifioppish.service.LOSTService.TAG, "Service destroyed");
}