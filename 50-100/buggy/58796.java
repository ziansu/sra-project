public java.lang.String getMessage(int size, pl.robertsadlowski.awardroutes.app.data.rulesModule.MileageLevels mileageLevels, java.lang.String zoneStart, java.lang.String zoneEnd) {
    java.lang.String message = null;
    if (((size > 3) && (zoneStart.equals(zoneEnd))) && (!(zoneStart.equals(Container.ANY_ZONE)))) {
        message = "Travel within zone possible with up to 3 segments only";
    }
    if ((size < 5) && ((mileageLevels.getY()) == 100)) {
        message = "Travel possible with 5 segments without zone rules";
    }
    return message;
}