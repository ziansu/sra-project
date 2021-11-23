private void setTimeIfDateOfVerifIsnotNull(java.lang.Long dateOfVerif, java.lang.String timeFrom, java.lang.String timeTo) {
    if (((dateOfVerif != null) && (timeFrom != null)) && (timeTo != null)) {
        this.timeFrom = java.time.LocalTime.parse(timeFrom);
        this.timeTo = java.time.LocalTime.parse(timeTo);
    }
}