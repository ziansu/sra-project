public java.lang.String fireAt(java.lang.String cord) {
    int x = xMap.indexOf(cord.toLowerCase().charAt(0));
    int y = (cord.charAt(1)) - 48;
    int result = gameBoard[x][y];
    if (result == 1) {
        gameBoard[x][y] = 2;
        return "hit";
    }
    return "miss";
}