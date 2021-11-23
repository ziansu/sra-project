@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (prevMonth)) {
        if ((month) <= 0) {
            month = 11;
            (year)--;
        }else {
            (month)--;
        }
        setGridCellAdapterToDate(month, year);
    }
    if (v == (nextMonth)) {
        if ((month) >= 11) {
            month = 0;
            (year)++;
        }else {
            (month)++;
        }
        setGridCellAdapterToDate(month, year);
    }
}