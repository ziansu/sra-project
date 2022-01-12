private void setScreenInformation() {
    mDistance = calculateDistanceToTheNextRadar(mRadars.get(0).getLatitude(), mRadars.get(0).getLongitude());
    setDistance(mDistance);
    mTextViewSpeedLimitValue.setText(java.lang.String.format(getString(R.string.text_view_speed_limit_value_text), mRadars.get(0).getMaxSpeed()));
    setRefreshTime(getCurrentTime());
}