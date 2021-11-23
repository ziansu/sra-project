private static boolean filterTrip(com.sortedunderbelly.motomileage.Trip trip, java.util.Date earliest, java.util.Date latest) {
    return ((earliest == null) || (!(trip.getDate().before(earliest)))) && ((latest == null) || (!(trip.getDate().after(latest))));
}