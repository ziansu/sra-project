public void setMapLocation(android.graphics.Point location) {
    mapLocation_dp.x = ((int) (java.lang.Math.ceil(((location.x) / (scale_dp)))));
    mapLocation_dp.y = ((int) (java.lang.Math.ceil(((location.y) / (scale_dp)))));
    this.mapLocation = location;
}