public void update() {
    grid.update(mouse);
    player1.update(board);
    player2.update(board);
    board.update();
    if (keyboard.r) {
        board.reset();
        keyboard.r = !(keyboard.r);
    }
}