public boolean isSmallerThen(com.frysoft.notifry.utils.Date date) {
    com.frysoft.notifry.utils.Logger.Log("Date", "isSmallerThen(Date)");
    return (((year) <= (date.year)) && ((month) <= (date.month))) && ((day) < (date.day));
}