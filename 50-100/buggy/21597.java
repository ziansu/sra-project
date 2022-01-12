private int findFreePage() {
    incrClockPtr();
    int startHere = getClockPtr();
    int endHere = startHere + (getTableSize());
    for (int i = startHere; i < endHere; i++) {
        int index = i % (getTableSize());
        if ((pageTable[index].getBFN()) == (-1)) {
            return index;
        }
        incrClockPtr();
    }
    return -1;
}