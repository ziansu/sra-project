int move(int x, int y) {
    if (checkLocation(currentPlayer, x, y, true)) {
        piece[x][y] = currentPlayer;
        currentPlayer *= -1;
        if (shouldPass(currentPlayer)) {
            if (shouldPass((-(currentPlayer)))) {
                currentPlayer *= -64;
            }else {
                java.lang.System.out.println("Pass!");
                currentPlayer *= -1;
            }
        }
    }else
        return 0;
    
    return currentPlayer;
}