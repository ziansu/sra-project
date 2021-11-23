public void setUrl(java.lang.String url) {
    org.openmrs.mobile.utilities.URLValidator.ValidationResult result = org.openmrs.mobile.utilities.URLValidator.validate(url);
    org.openmrs.mobile.activities.LoginActivity.mLastURL = result.getUrl();
    if (result.isURLValid()) {
        mSpinner.setVisibility(View.VISIBLE);
        mLoginFormView.setVisibility(View.GONE);
        new org.openmrs.mobile.net.LocationManager().getAvailableLocation(org.openmrs.mobile.net.helpers.LocationHelper.createAvailableLocationListener(result.getUrl(), this));
    }else {
        showInvalidURLDialog();
    }
}