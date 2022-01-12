private void updateDates(java.util.Date start, java.util.Date end) {
    try {
        listenersEnabled = false;
        model.setStartDate(start);
        model.setEndDate(end);
        model.setSelectedDate(start);
        setStartDate(start);
        setEndDate(end);
    } finally {
        listenersEnabled = true;
    }
}