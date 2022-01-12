private void loadSavedData() {
    times = service.loadDayWorklog(calendar.getTime(), getApplicationContext());
    for (java.util.Map.Entry<eu.leneurone.timelog.model.Marker, eu.leneurone.timelog.model.Time> timeEntry : times.entrySet()) {
        displayTime(timeEntry.getKey(), timeEntry.getValue());
    }
}