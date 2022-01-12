public void multiChooseRefresh(java.util.HashSet<java.lang.Integer> set) {
    for (java.lang.Integer day : set) {
        setDayColor(findDestView(day), com.othershe.calendarview.MonthView.COLOR_SET);
        chooseDays.add(day);
    }
    if ((chooseDays.contains(dateInit[2])) && (!(set.contains(dateInit[2])))) {
        setDayColor(findDestView(dateInit[2]), com.othershe.calendarview.MonthView.COLOR_RESET);
        chooseDays.remove(dateInit[2]);
    }
    invalidate();
}