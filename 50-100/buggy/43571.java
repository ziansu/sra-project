private void filterDriversByMaxWorkingHours(java.util.Map<com.tsystems.javaschool.logiweb.model.Driver, java.lang.Float> workingHoursToFilter, float maxWorkingHours) {
    for (java.util.Map.Entry<com.tsystems.javaschool.logiweb.model.Driver, java.lang.Float> e : workingHoursToFilter.entrySet()) {
        if ((e.getValue()) >= maxWorkingHours) {
            workingHoursToFilter.remove(e.getKey());
        }
    }
}