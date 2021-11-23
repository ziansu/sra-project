public double getDataVolumeDailyAvg() {
    final java.lang.Long dataVolume = pluginRequestRepo.getPluginTotalDataBytes(null, null);
    final java.lang.Long days = pluginRequestRepo.getNumberOfDays();
    if ((days != null) && (dataVolume != null)) {
        return ((double) (dataVolume)) / days;
    }
    return 0;
}