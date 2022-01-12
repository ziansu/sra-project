@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
@java.lang.Override
public void run() {
    final com.google.android.gms.maps.model.LatLng res = map.gpsPosAlt();
    final hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.Coordinate coord;
    if (res == null) {
        coord = new hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.Coordinate(0, 0);
    }else {
        coord = new hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.Coordinate(res.latitude, res.longitude);
    }
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            nextQuestion(coord);
        }
    });
}