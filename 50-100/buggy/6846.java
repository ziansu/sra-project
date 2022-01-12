public void setLongitude(java.lang.String longitude) {
    int[] longitudeDMS = fiskinfoo.no.sintef.fiskinfoo.Implementation.FiskInfoUtility.decimalToDMSArray(java.lang.Double.valueOf(longitude));
    latitudeDegreesEditText.setText(java.lang.String.valueOf(longitudeDMS[0]));
    latitudeMinutesEditText.setText(java.lang.String.valueOf(longitudeDMS[1]));
    latitudeSecondsEditText.setText(java.lang.String.valueOf(longitudeDMS[2]));
    longitudeCardinalDirectionSwitch.setChecked(((java.lang.Double.valueOf(longitude)) < 0));
}