public void setFlagsFromString(java.lang.String flagPositions) {
    for (int i = 0; i < (boardSize); i++) {
        for (int j = 0; j < (boardSize); j++) {
            flag[i][j] = (flagPositions.charAt(((i * (boardSize)) + j))) == '1';
        }
    }
}