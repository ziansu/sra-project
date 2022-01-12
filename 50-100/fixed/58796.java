public java.lang.String getMessage(int size, pl.robertsadlowski.awardroutes.app.data.rulesModule.MileageLevels mileageLevels, java.lang.String zoneStart, java.lang.String zoneEnd) {
    java.lang.String message = null;
    if (((size > 3) && (zoneStart.equals(zoneEnd))) && (!(zoneStart.equals(Container.ANY_ZONE)))) {
        message = "Travel within zone possible with up to 3 segments only";
    }
    return message;
}