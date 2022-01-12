public int next() {
    if (((currentPosition) <= (realEstate.SortedList.list.length)) && ((realEstate.SortedList.list[currentPosition]) == (-1))) {
        currentPosition = 0;
        return realEstate.SortedList.list[currentPosition];
    }
    return realEstate.SortedList.list[((currentPosition)++)];
}