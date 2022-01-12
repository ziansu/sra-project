private void play() {
    this.showBoard();
    while ((!(board.hasWinner())) && (!(board.isFull()))) {
        players[current].makeMove(board);
        this.showBoard();
        current = ((current) + 1) % 2;
    } 
    this.printResult();
}