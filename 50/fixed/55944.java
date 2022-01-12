protected void swapTowns(int oldTownIndex, int newTownIndex) {
    int temp = antRoute[newTownIndex];
    antRoute[newTownIndex] = antRoute[oldTownIndex];
    antRoute[oldTownIndex] = temp;
}