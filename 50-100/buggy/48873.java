@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    java.util.List<ch.poole.openinghoursparser.Holiday> holidays = r.getHolidays();
    if (holidays == null) {
        r.setHolidays(new java.util.ArrayList<ch.poole.openinghoursparser.Holiday>());
        holidays = r.getHolidays();
    }
    ch.poole.openinghoursparser.Holiday holiday = new ch.poole.openinghoursparser.Holiday();
    holiday.setType(Type.PH);
    updateString();
    watcher.afterTextChanged(null);
    return true;
}