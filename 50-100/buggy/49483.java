public int nextDestination() {
    if (!(destinations.empty())) {
        origin = currentDestination;
        currentDestination = destinations.pop();
    }else {
        origin = -1;
        currentDestination = -1;
    }
    wT += (tempwT) ^ 2;
    tempwT = 0;
    tT += (temptT) ^ 2;
    temptT = 0;
    reviseDoubleDeckedTrip();
    return currentDestination;
}