private static int amountOfHolidaysUntil(java.util.List<java.util.Calendar> holidays, java.util.Calendar stopCal) {
    int result = 0;
    for (java.util.Calendar cal : holidays) {
        if (cal.before(stopCal)) {
            result++;
        }
    }
    return result;
}