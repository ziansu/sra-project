public void parseNewsDeskValue() {
    if ((newsDesk) != null) {
        checkArts = (newsDesk.contains("Arts")) ? true : false;
        checkFashion = (newsDesk.contains("Fashion & Style")) ? true : false;
        checkSports = (newsDesk.contains("Sports")) ? true : false;
    }
}