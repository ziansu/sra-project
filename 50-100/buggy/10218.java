private void drawCurMarker() {
    if (((cLatitude) != 0.0) || ((cLongitude) != 0.0)) {
        com.skp.Tmap.TMapPoint tMapPoint = new com.skp.Tmap.TMapPoint(cLatitude, cLongitude);
        com.skp.Tmap.TMapMarkerItem tItem = new com.skp.Tmap.TMapMarkerItem();
        tItem.setTMapPoint(tMapPoint);
        com.example.youngseok.myapplication.MainActivity.tMapView.addMarkerItem("현재위치", tItem);
        com.example.youngseok.myapplication.MainActivity.tMapView.setCenterPoint(cLongitude, cLatitude, true);
        com.example.youngseok.myapplication.MainActivity.tMapView.setZoomLevel(15);
    }else {
        android.widget.Toast.makeText(this, "\uc704\uce58 \ud655\uc778 \uc911\n\uc7a0\uc2dc \ud6c4 \ub2e4\uc2dc \uc2dc\ub3c4\ud558\uc138\uc694", Toast.LENGTH_SHORT).show();
    }
}