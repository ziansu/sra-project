private int[][] arcToIntArray(Arc[][] arcs) {
    int[][] returnArray = new int[BOARD_SIZE][BOARD_SIZE];
    for (int i = 0; i < (BOARD_SIZE); i++) {
        for (int j = 0; j < (BOARD_SIZE); j++) {
            returnArray[i][j] = arcs[i][j].value;
        }
    }
    return returnArray;
}