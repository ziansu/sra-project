private void play() {
    this.showBoard();
    do {
        players[current].makeMove(board);
        this.showBoard();
        current = ((current) + 1) % 2;
    } while ((!(board.hasWinner())) && (!(board.isFull())) );
    this.printResult();
}