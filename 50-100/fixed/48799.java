public double getHigherBound() {
    higherBoundNumber = 0.0;
    for (int b = 0; b < (crews.length); b++) {
        if (b == 0) {
            higherBoundNumber = crews[b].hoursOfWork();
        }
        if ((crews[b].hoursOfWork()) >= (higherBoundNumber)) {
            higherBoundNumber = crews[b].hoursOfWork();
        }
    }
    return higherBoundNumber;
}