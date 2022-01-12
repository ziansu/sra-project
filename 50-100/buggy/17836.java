private static boolean maxVolunteersPerJobExceeded(final java.lang.String parkName, final java.lang.String jobName) {
    return ((com.theTechNinjas.urbanParks.model.DataStore.getInstance().getVolunteers(parkName, jobName).size()) + 1) >= (com.theTechNinjas.urbanParks.model.DataStore.getInstance().getMaxVolunteersPerJob());
}