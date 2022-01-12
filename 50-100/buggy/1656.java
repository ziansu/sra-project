@java.lang.Override
public int compare(dbResources.FlightCombo combo1, dbResources.FlightCombo combo2) {
    if (ascending) {
        return java.lang.Integer.compare(combo1.getDepartureTimeInMin(), combo2.getDepartureTimeInMin());
    }else {
        return java.lang.Integer.compare(combo2.getDepartureTimeInMin(), combo1.getDepartureTimeInMin());
    }
}