@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (prevMonth)) {
        if ((month) <= 1) {
            month = 12;
            (year)--;
        }else {
            (month)--;
        }
        setGridCellAdapterToDate(month, year);
    }
    if (v == (nextMonth)) {
        if ((month) > 11) {
            month = 1;
            (year)++;
        }else {
            (month)++;
        }
        setGridCellAdapterToDate(month, year);
    }
}