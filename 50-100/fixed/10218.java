private void drawCurMarker() {
    if (((cLatitude) != 0.0) || ((cLongitude) != 0.0)) {
        com.skp.Tmap.TMapPoint tMapPoint = new com.skp.Tmap.TMapPoint(cLatitude, cLongitude);
        com.skp.Tmap.TMapMarkerItem tItem = new com.skp.Tmap.TMapMarkerItem();
        tItem.setTMapPoint(tMapPoint);
        com.example.youngseok.myapplication.MainActivity.tMapView.addMarkerItem("현재위치", tItem);
        com.example.youngseok.myapplication.MainActivity.tMapView.setCenterPoint(cLongitude, cLatitude, false);
        com.example.youngseok.myapplication.MainActivity.tMapView.setZoomLevel(15);
    }
}