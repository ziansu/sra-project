public long getIshaTimestamp() {
    int[] hijri = net.gahfy.muslimcompanion.utils.DateUtils.getHijriFromJulianDay(net.gahfy.muslimcompanion.utils.DateUtils.dateToJulian(year, month, day));
    double delayToAdd = ((hijri[1]) == 9) ? ishaDelayOnRamadhan : ishaDelayNormal;
    double hoursInTheDay = ((getDhuhr()) + (getTimeBelowHorizonDifference(ishaAngle))) + delayToAdd;
    return net.gahfy.muslimcompanion.utils.DateUtils.utcTimeToTimestamp(year, month, day, hoursInTheDay);
}