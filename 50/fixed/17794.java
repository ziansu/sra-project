public boolean removeItinerary(long id) {
    return (mItineraryDb.delete(ItineraryListContract.ItineraryListEntry.TABLE_NAME, (((ItineraryListContract.ItineraryListEntry._ID) + "=") + id), null)) > 0;
}