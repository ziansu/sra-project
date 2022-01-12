public boolean isGreaterThen(com.frysoft.notifry.utils.Date date) {
    com.frysoft.notifry.utils.Logger.Log("Date", "isGreaterThen(Date)");
    return (((year) > (date.year)) && ((month) > (date.month))) && ((day) > (date.day));
}