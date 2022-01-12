public static int getTotalDaysUntil(com.frysoft.notifry.utils.Date date) {
    com.frysoft.notifry.utils.Logger.Log("Date", "getTotalDaysUntil(Date)");
    return ((com.frysoft.notifry.utils.Date.getDaysUntilYear(date.year)) + (com.frysoft.notifry.utils.Date.getDaysUntilMonth(date.month, date.year))) + (date.day);
}