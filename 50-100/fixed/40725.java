private android.location.Criteria getCriteria() {
    android.location.Criteria criteria = new android.location.Criteria();
    criteria.setAccuracy(Criteria.ACCURACY_FINE);
    criteria.setSpeedRequired(false);
    criteria.setCostAllowed(true);
    criteria.setBearingRequired(false);
    criteria.setAltitudeRequired(false);
    criteria.setPowerRequirement(Criteria.POWER_LOW);
    return criteria;
}