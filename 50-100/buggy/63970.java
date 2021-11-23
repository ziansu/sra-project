private void updateDates(java.util.Date start, java.util.Date end) {
    try {
        listenersEnabled = false;
        model.setStartDate(start);
        model.setEndDate(end);
        model.setSelectedDate(start);
        startDateSelection.setDate(start);
        endDateSelection.setDate(end);
    } finally {
        listenersEnabled = true;
    }
}