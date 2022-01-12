public void update() {
    grid.update(mouse);
    player1.update(grid);
    player2.update(grid);
    board.update();
    if (keyboard.r) {
        board.reset();
        keyboard.r = !(keyboard.r);
    }
}