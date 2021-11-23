@java.lang.Override
public void run() {
    java.util.Date foy = be.rla.jtaken.helpers.DateHelper.getFirstOfYear(be.rla.jtaken.helpers.DateHelper.getFirstOfMonth(be.rla.jtaken.helpers.DateHelper.getNow()));
    textFieldBegin.setText(be.rla.jtaken.helpers.DateHelper.getDate(foy));
    showCalendar();
}