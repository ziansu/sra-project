private int determineCurrentPosition(int startingPosition) {
    int position = startingPosition;
    if (startsWithSign) {
        position = position + 1;
    }
    return position;
}