private static java.lang.String getTZString(int hourOffset, int minuteOffset) {
    java.lang.String tzString = (("GMT" + ((hourOffset < 0) || ((0 == hourOffset) && (minuteOffset < 0)) ? "-" : "+")) + (java.lang.String.format("%02d", (hourOffset >= 0 ? hourOffset : hourOffset * (-1))))) + (java.lang.String.format("%02d", (minuteOffset >= 0 ? minuteOffset : minuteOffset * (-1))));
    return tzString;
}