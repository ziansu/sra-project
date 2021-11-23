public java.util.Date getDate() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    eu.transkribus.swt_canvas.util.SCSimpleDateTimeWidget.logger.debug(((((("y = " + (getYear())) + " m = ") + (getMonth())) + " d = ") + (getDay())));
    cal.set(getYear(), getMonth(), getDay());
    return cal.getTime();
}