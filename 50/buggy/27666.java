public java.util.List<dataClasses.Journey> getJourneys() {
    java.util.List<java.lang.String> lines = readLinesFromFile();
    return (year) == 2015 ? get2015Journeys(lines) : get2014Journeys(lines);
}