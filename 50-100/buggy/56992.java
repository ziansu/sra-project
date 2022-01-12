private void setDashboards(java.util.List<org.hisp.dhis.android.dashboard.api.models.Dashboard> dashboards) {
    mDashboardAdapter = new org.hisp.dhis.android.dashboard.ui.adapters.DashboardAdapter(getChildFragmentManager());
    mViewPager.setAdapter(mDashboardAdapter);
    mDashboardAdapter.swapData(dashboards);
    mTabs.removeAllTabs();
    if ((dashboards != null) && (!(dashboards.isEmpty()))) {
        mTabs.setupWithViewPager(mViewPager);
    }
}