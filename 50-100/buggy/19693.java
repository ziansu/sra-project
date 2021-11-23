@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
@java.lang.Override
public void run() {
    final com.google.android.gms.maps.model.LatLng res = map.gpsPosAlt();
    final hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.Coordinate coord = new hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.Coordinate(res.latitude, res.longitude);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (coord == null) {
            }else {
                nextQuestion(coord);
            }
        }
    });
}