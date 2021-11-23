public static models.Location update(models.Location l, models.Location location) {
    location.setName(l.name);
    location.setLatitude(l.latitude);
    location.setLongitude(l.longitude);
    location.setRadius(l.radius);
    location.setZoom(l.zoom);
    location.setShowPin(l.showpin);
    location.setAsMainStoryLocation(l.ismain);
    location.save(DBConstants.lir_backoffice);
    return location;
}