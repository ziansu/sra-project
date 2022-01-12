private java.lang.String floorYearToDecade(int year) {
    if (year > 0) {
        return java.lang.String.valueOf(((year / 10) * 10));
    }else {
        return null;
    }
}