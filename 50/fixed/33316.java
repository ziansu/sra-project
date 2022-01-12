@java.lang.Override
public void onPause() {
    super.onPause();
    if ((gps) != null) {
        gps.stopGPS();
    }
    com.pommerening.quinn.foodtruck.fragment.MiniMapFragment.toggle = true;
}