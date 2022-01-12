public int getNumberOfPeopleWaitingAtFloor(int floor) {
    if ((floors) == null)
        return 0;
    
    return floors[floor].getPersonCount();
}