public void setDurationInSeconds(java.lang.Long value) {
    durationInSeconds.setValue(value);
    java.time.LocalDateTime newDateTimeEnd = getDateTimeStart().plusSeconds(getDurationInSeconds());
    setDateTimeEnd(newDateTimeEnd);
}