private void checkUnits() {
    if (com.ford.mobileweather.smartdevicelink.features.UnitChoiceActivity.getInstance().getChoice()) {
        unitsInMetric = true;
    }
    isMetric();
}