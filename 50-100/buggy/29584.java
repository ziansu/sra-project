@java.lang.Override
public boolean accepts(@org.eclipse.jdt.annotation.NonNull
final cgeo.geocaching.models.Geocache cache) {
    final cgeo.geocaching.location.Geopoint currentPos = new cgeo.geocaching.location.Geopoint(geo);
    final cgeo.geocaching.location.Geopoint coords = cache.getCoords();
    if (coords == null) {
        return false;
    }
    final float distance = currentPos.distanceTo(coords);
    return (distance >= (minDistance)) && (distance <= (maxDistance));
}