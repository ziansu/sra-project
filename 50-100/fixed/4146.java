public void update() {
    for (int x = 0; x <= 48; x++) {
        for (int y = 0; y <= 50; y++) {
            if ((board[x][y]) == null) {
                asciiboard[x][y] = ' ';
            }else {
                asciiboard[x][y] = board[x][y].toString().charAt(0);
            }
        }
    }
}