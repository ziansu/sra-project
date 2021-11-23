@java.lang.Override
protected void init() {
    android.util.Log.d(com.zhan.budget.Fragment.MonthReportFragment.TAG, "init");
    super.init();
    monthReportList = new java.util.ArrayList<>();
    monthReportGridView = ((android.widget.GridView) (view.findViewById(R.id.monthReportGridView)));
    monthReportGridAdapter = new com.zhan.budget.Adapter.MonthReportGridAdapter(this, monthReportList);
    monthReportGridView.setAdapter(monthReportGridAdapter);
    currentYear = new java.util.Date();
    createMonthCard();
    updateYearInToolbar(0);
}