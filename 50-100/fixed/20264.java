public boolean isOpened() throws java.lang.IllegalStateException {
    int key = getKey();
    cosapp.com.nostra.OpeningHours openingHours = this.openingHours.get(key);
    if (openingHours != null) {
        if (openingHours.isOpenedAllDay()) {
            return true;
        }else
            if (openingHours.isClosedAllDay()) {
                return false;
            }
        
    }
    if (openingHours == null) {
        throw new java.lang.IllegalStateException("Information not available");
    }
    if (isBetweenTwoLocalTimes(openingHours)) {
        return true;
    }else {
        return false;
    }
}