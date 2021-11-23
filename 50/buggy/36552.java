@java.lang.Override
public void onPause() {
    me.instabattle.app.activities.MapActivity.viewPoint = googleMap.getCameraPosition().target;
    me.instabattle.app.activities.MapActivity.viewZoom = googleMap.getCameraPosition().zoom;
}