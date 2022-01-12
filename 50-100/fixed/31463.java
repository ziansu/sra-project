private java.lang.String getProperDistanceFormat(double distanceInKilometer) {
    int distanceInMeter = ((int) (java.lang.Math.floor((distanceInKilometer * 1000))));
    if (distanceInMeter < 1000) {
        return distanceInMeter + (mContext.getString(R.string.meter));
    }else {
        return (java.lang.String.valueOf(distanceInKilometer).substring(0, 4)) + "km";
    }
}