private static java.util.List<smartcity.accessibility.navigation.MapSegment> getSegmentsToAvoid(smartcity.accessibility.mapmanagement.Location source, smartcity.accessibility.mapmanagement.Location destination, java.lang.Integer accessibilityThreshold) throws smartcity.accessibility.navigation.exception.CommunicationFailed {
    java.util.List<com.teamdev.jxmaps.LatLng> locationsToAvoid = smartcity.accessibility.database.LocationManager.getNonAccessibleLocationsInRadius(source, destination, accessibilityThreshold);
    java.util.List<smartcity.accessibility.navigation.MapSegment> $ = new java.util.ArrayList<smartcity.accessibility.navigation.MapSegment>();
    for (com.teamdev.jxmaps.LatLng ¢ : locationsToAvoid)
        $.add(smartcity.accessibility.navigation.Navigation.getMapSegmentOfLatLng(¢.getLat(), ¢.getLng()));
    
    return $;
}