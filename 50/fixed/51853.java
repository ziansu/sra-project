private void showTripProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    if ((mArrivalInfo) == null) {
        showArrivalListFragment(obaStop);
    }else {
        org.onebusaway.android.report.ui.ReportTripProblemFragment.show(this, mArrivalInfo, R.id.ri_report_stop_problem);
        mArrivalInfo = null;
    }
}