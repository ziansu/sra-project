private float calculateDistance(final io.github.fvasco.pinpoi.model.Placemark p) {
    other.setLongitude(p.getLongitude());
    other.setLatitude(p.getLatitude());
    return center.distanceTo(other);
}