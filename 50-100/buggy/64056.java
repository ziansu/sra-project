private java.util.ArrayList<rUBERn.Driver> rankDrivers(rUBERn.Journey journey) {
    java.util.ArrayList<rUBERn.Driver> rankedDrivers = new java.util.ArrayList<>();
    java.util.ArrayList<rUBERn.Driver> possibleDrivers = new java.util.ArrayList<>();
    for (rUBERn.Driver driver : drivers) {
        if (driver.canTakeJob(journey));
        possibleDrivers.add(driver);
    }
    possibleDrivers.sort(new rUBERn.DriverComparatorByImageForJourney(journey));
    return possibleDrivers;
}