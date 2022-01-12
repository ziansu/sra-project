@java.lang.Override
public void onClick(android.view.View v) {
    if ((mUnit) == null) {
        return ;
    }
    mPbReportLoading.setVisibility(View.VISIBLE);
    setStatusBoxText(getString(R.string.loading_report));
    mAdapter = new com.alex.onereport2.OneReportActivity.ReportEntryAdapter(this, new com.alex.onereport2.model.ReportEntry[0]);
    mElvReportEntry.setAdapter(mAdapter);
    sendAPIRequestGetReport(mDate, mUnit);
}