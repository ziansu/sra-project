public void wallsAndGatesV0(int[][] rooms) {
    if (checkCornerCase(rooms)) {
        return ;
    }
    for (int i = 0; i < (rooms.length); i++) {
        for (int j = 0; j < (rooms[0].length); j++) {
            if ((rooms[i][j]) >= 0) {
                bfsHelper(rooms, i, j);
            }
        }
    }
}