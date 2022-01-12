@java.lang.Override
public void onArrivalItemClicked(org.onebusaway.android.io.elements.ObaArrivalInfo obaArrivalInfo, java.lang.String agencyName) {
    mShowArrivalListFragment = false;
    mAgencyName = agencyName;
    removeFragmentByTag(SimpleArrivalListFragment.TAG);
    if (((mSelectedTransitService) != null) && (ReportConstants.DYNAMIC_TRANSIT_SERVICE_TRIP.equals(mSelectedTransitService.getType()))) {
        showOpen311ProblemFragment(mSelectedTransitService, obaArrivalInfo);
    }else {
        org.onebusaway.android.report.ui.ReportTripProblemFragment.show(this, obaArrivalInfo, R.id.ri_report_stop_problem);
    }
}