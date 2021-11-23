public void left() {
    if ((y) > 0) {
        remove(board, world);
        this.y -= 1;
        print(board);
    }
}