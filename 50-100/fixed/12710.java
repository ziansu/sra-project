public void play() {
    setup();
    while ((playerList.size()) > 1) {
        for (int i = 0; i < (playerList.size()); i++) {
            playerList.get(i).turn(board, this);
            printBoard();
        }
    } 
}