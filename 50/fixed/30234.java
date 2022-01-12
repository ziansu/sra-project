private void setDateOnly(defaultPart.TaskDate destination, defaultPart.TaskDate source) {
    destination.set(java.util.Calendar.YEAR, source.get(java.util.Calendar.YEAR));
    destination.set(java.util.Calendar.DAY_OF_YEAR, source.get(java.util.Calendar.DAY_OF_YEAR));
}