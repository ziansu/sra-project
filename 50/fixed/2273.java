public void showLocationSearch() {
    mLocationAddSection.setVisibility(View.GONE);
    mLocationSearchSection.setVisibility(View.VISIBLE);
    mLocationViewSection.setVisibility(View.GONE);
    org.wordpress.android.util.EditTextUtils.showSoftInput(mLocationEditText);
}