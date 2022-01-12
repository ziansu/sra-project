private int[] shift(int[] coor, int dir, int orientation) {
    int[] shiftedCoordinate = coor.clone();
    for (int i = 0; i < (numDim); i++) {
        shiftedCoordinate[i] = (+orientation) * (unitVectors[dir][i]);
    }
    return periodic(shiftedCoordinate);
}