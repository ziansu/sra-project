protected int getDay(java.awt.Point point) {
    int row = tblCalendar.rowAtPoint(point);
    int col = tblCalendar.columnAtPoint(point);
    if (row < 0) {
        return 0;
    }
    if (col < 0) {
        return 0;
    }
    java.lang.Object valueAt = mtblCalendar.getValueAt(row, col);
    if (valueAt instanceof de.nmichael.efa.calendar.CalendarString) {
        de.nmichael.efa.calendar.CalendarString value = ((de.nmichael.efa.calendar.CalendarString) (valueAt));
        return value.getDay();
    }
    return 0;
}