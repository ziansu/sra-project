@java.lang.Override
public void run() {
    try {
        java.util.Date m3b = be.rla.jtaken.helpers.DateHelper.getFirstOfMonth(be.rla.jtaken.helpers.DateHelper.addToDate(be.rla.jtaken.helpers.DateHelper.getFirstOfMonth(be.rla.jtaken.helpers.DateHelper.getDate(getDateDebut())), java.util.Calendar.MONTH, (-3)));
        textFieldBegin.setText(be.rla.jtaken.helpers.DateHelper.getDate(m3b));
        showCalendar();
    } catch (java.text.ParseException e) {
    }
}