public boolean isBetweenStartEnd(int index) {
    if (((index >= (_startIndex)) && (index <= (_endIndex))) && ((_startIndex) != (_endIndex))) {
        return true;
    }
    return false;
}