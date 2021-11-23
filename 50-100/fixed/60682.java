private static java.lang.String getTZString(int hourOffset, int minuteOffset) {
    java.lang.String tzString = (("GMT" + ((hourOffset < 0) || ((0 == hourOffset) && (minuteOffset < 0)) ? "-" : "+")) + (java.lang.String.format("%02d", java.lang.Math.abs(hourOffset)))) + (java.lang.String.format("%02d", java.lang.Math.abs(minuteOffset)));
    return tzString;
}