public double getLowerBound() {
    lowerBoundNumber = 0.0;
    for (int a = 0; a < (crews.length); a++) {
        if (a == 0) {
            lowerBoundNumber = crews[a].hoursOfWork();
        }
        if ((crews[a].hoursOfWork()) < (lowerBoundNumber)) {
            lowerBoundNumber = crews[a].hoursOfWork();
        }
    }
    return lowerBoundNumber;
}