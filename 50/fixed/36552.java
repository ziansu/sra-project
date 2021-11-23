@java.lang.Override
public void onPause() {
    super.onPause();
    me.instabattle.app.activities.MapActivity.viewPoint = googleMap.getCameraPosition().target;
    me.instabattle.app.activities.MapActivity.viewZoom = googleMap.getCameraPosition().zoom;
}