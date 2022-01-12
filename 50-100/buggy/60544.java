public void display() {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if ((board[i][j].getContents()) == 9) {
                java.lang.System.out.print('*');
                java.lang.System.out.print(" ");
            }else {
                java.lang.System.out.print(board[j][i].getContents());
                java.lang.System.out.print(" ");
            }
        }
        java.lang.System.out.println();
    }
}