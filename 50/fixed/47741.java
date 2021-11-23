public void setOnDayClickListener(com.genestream.monthview.OnDayClickListener onDayClickListener) {
    mOnDayClickListener = onDayClickListener;
    for (com.genestream.monthview.MonthView monthView : mMonthItemViews) {
        if (monthView != null) {
            monthView.setOnDayClickListener(mOnDayClickListener);
        }
    }
}