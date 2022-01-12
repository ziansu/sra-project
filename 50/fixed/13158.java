public void down() {
    synchronized(board) {
        remove(board, world);
        this.x += 1;
        print(board);
    }
}