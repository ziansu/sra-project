@java.lang.Override
public org.osmdroid.util.BoundingBox getBoundingBox() {
    return org.osmdroid.util.BoundingBox.fromGeoPoints(mCoordinates);
}