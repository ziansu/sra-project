private static boolean isMeet(test.model.Horse firstHorse, test.model.Horse secondHorse) {
    boolean result = false;
    if (((firstHorse.getHorizontalCoordinates()) == (secondHorse.getHorizontalCoordinates())) && ((firstHorse.getVerticalCoordinates()) == (secondHorse.getVerticalCoordinates()))) {
        result = true;
    }
    return result;
}