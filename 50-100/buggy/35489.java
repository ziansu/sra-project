public static void reactToLocationChange(pl.papistudio.localizer3000.Location location, android.content.Context context, pl.papistudio.localizer3000.LocationService service) {
    pl.papistudio.localizer3000.System.service = service;
    pl.papistudio.localizer3000.Location nearestLocation = pl.papistudio.localizer3000.System.findBestSuitedLocation(location, context);
    pl.papistudio.localizer3000.System.currentlyActiveLocation = nearestLocation;
    if (nearestLocation != null)
        pl.papistudio.localizer3000.System.updatePhoneStatusForFoundLocation(nearestLocation);
    else
        android.util.Log.d("System Location", "There is no good location to apply...");
    
}