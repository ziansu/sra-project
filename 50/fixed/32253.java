@java.lang.Override
public void run() {
    java.util.Date foy = getFirstOfYear(getFirstOfMonth(getNow()));
    textFieldBegin.setText(getDate(foy));
    showCalendar();
}