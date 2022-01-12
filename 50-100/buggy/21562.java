@java.lang.Override
public void dateChanged(int year, int month, int day, boolean startEnd) {
    if (startEnd) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.date.setText(((((("" + (this.day)) + " / ") + (this.month)) + " / ") + (this.year)));
    }
}