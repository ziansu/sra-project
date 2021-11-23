private void refreshMonthView(int position) {
    com.othershe.calendarview.MonthView monthView = calendarPagerAdapter.getViews().get(position);
    if ((itemChooseListener) != null) {
        if ((chooseDate.get(position)) != null)
            monthView.multiChooseRefresh(chooseDate.get(position));
        
    }else {
        monthView.refresh(lastClickedDay);
    }
}