private boolean insideBoundary() {
    int count = 0;
    if ((drone.getGPSLatLon()) != null) {
        commoninterface.mathutils.Vector2d dronePosition = commoninterface.utils.CoordinateUtilities.GPSToCartesian(drone.getGPSLatLon());
        for (commoninterface.utils.Line l : lines) {
            if ((l.intersectsWithLineSegment(dronePosition, new commoninterface.mathutils.Vector2d(0, (-(java.lang.Integer.MAX_VALUE))))) != null)
                count++;
            
        }
        return (count % 2) != 0;
    }
    return false;
}