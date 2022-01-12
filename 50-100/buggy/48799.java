public double getHigherBound() {
    higherBoundNumber = 0.0;
    for (int a = 0; a < (crews.length); a++) {
        if (a == 0) {
            higherBoundNumber = crews[a].hoursOfWork();
        }
        if ((crews[a].hoursOfWork()) > (higherBoundNumber)) {
            higherBoundNumber = crews[a].hoursOfWork();
        }
    }
    return higherBoundNumber;
}