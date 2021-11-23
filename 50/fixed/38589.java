@java.lang.Override
public void run() {
    textFieldBegin.setText(getDate(getFirstOfMonth(getNow())));
    showCalendar();
}