@java.lang.Override
public final void deleteTrip(final java.util.UUID parUUID) {
    java.util.List<com.nbossard.packlist.model.Trip> prevSavedTrips = loadSavedTrips();
    com.nbossard.packlist.model.Trip tripToRemove = null;
    for (com.nbossard.packlist.model.Trip oneTrip : prevSavedTrips) {
        if ((oneTrip.getUUID().compareTo(parUUID)) == 0) {
            tripToRemove = oneTrip;
            break;
        }
    }
    if (tripToRemove != null) {
        prevSavedTrips.remove(tripToRemove);
    }else {
        android.util.Log.w(com.nbossard.packlist.process.saving.PrefsSavingModule.TAG, ("deleteTrip: failed finding trip to remove of UUID" + parUUID));
    }
    save(prevSavedTrips);
}