public int nextDestination() {
    if (!(destinations.empty())) {
        origin = currentDestination;
        currentDestination = destinations.pop();
    }else {
        origin = -1;
        currentDestination = -1;
    }
    reviseDoubleDeckedTrip();
    wT += (tempwT) * (tempwT);
    tempwT = 0;
    tT += (temptT) * (temptT);
    temptT = 0;
    java.lang.System.out.println(wT);
    java.lang.System.out.println(tT);
    return currentDestination;
}