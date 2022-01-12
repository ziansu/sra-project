@java.lang.Override
public void onSelected(boolean isUserScroll, int selectedIndex, java.lang.String item) {
    selectedYearIndex = selectedIndex;
    int year = cn.qqtheme.framework.util.DateUtils.trimZero(item);
    changeDayData(year, changeMonthData(year));
    if ((selectedMonthIndex) == 0) {
        monthView.setItems(months);
    }else {
        monthView.setItems(months, selectedMonthIndex);
    }
    dayView.setItems(days, selectedDayIndex);
}