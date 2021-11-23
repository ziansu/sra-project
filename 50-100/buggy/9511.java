private void refreshMonthView(int position) {
    com.othershe.calendarview.MonthView monthView = calendarPagerAdapter.getViews().get(position);
    if ((itemChooseListener) != null) {
        if (((chooseDate.get(position)) != null) && ((chooseDate.get(position).size()) > 0))
            monthView.multiChooseRefresh(chooseDate.get(position));
        
    }else {
        monthView.refresh(lastClickedDay);
    }
}