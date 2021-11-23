public int getNumberOfSeries() {
    if ((jsOverlay.getSeries()) != null) {
        return jsOverlay.getSeries().length();
    }else {
        return 0;
    }
}