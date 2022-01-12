private int[] findEmptySpace() {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if ((boardArray[i][j]) == 0) {
                return new int[]{ i , j };
            }
        }
    }
    return new int[]{ 10 , 10 };
}