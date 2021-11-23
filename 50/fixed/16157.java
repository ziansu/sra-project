private int next(int numberOfPartitions) {
    if ((index) >= numberOfPartitions) {
        index = 0;
    }
    int indexToReturn = (index)++;
    return indexToReturn >= numberOfPartitions ? 0 : indexToReturn;
}