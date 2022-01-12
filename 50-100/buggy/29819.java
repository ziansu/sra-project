@java.lang.Override
public void run() {
    com.amap.api.maps2d.model.Polyline polyline = aMap.addPolyline(new com.amap.api.maps2d.model.PolylineOptions().addAll(latLngs).width(2).color(android.graphics.Color.argb(255, 1, 1, 1)));
    aMap.moveCamera(com.amap.api.maps2d.CameraUpdateFactory.changeLatLng(latLng));
}