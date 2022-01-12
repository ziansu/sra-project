private void fillYAxisGoingUp(int x, int y, char fillCharacter) {
    for (int yIndex = y; yIndex <= (height); yIndex++) {
        if (checkIfCanFillAtLocation(x, yIndex, fillCharacter)) {
            canvas[yIndex][x] = fillCharacter;
        }
    }
}