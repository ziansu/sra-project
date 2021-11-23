private boolean ally(Location location, int myID) {
    return (location.getSite().owner) == myID;
}