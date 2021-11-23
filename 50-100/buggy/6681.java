public int next() {
    if ((currentPosition) == ((realEstate.SortedList.list.length) - 1)) {
        currentPosition = 0;
        return realEstate.SortedList.list[currentPosition];
    }
    return realEstate.SortedList.list[((currentPosition)++)];
}