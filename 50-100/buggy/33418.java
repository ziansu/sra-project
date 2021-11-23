public void parseNewsDeskValue() {
    if ((newsDesk) != null) {
        if (newsDesk.contains("Arts")) {
            checkArts = true;
        }
        if (newsDesk.contains("Fashion & Style")) {
            checkFashion = true;
        }
        if (newsDesk.contains("Sports")) {
            checkSports = true;
        }
    }
}