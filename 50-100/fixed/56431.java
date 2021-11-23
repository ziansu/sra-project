private static int countVector(int vY, int vX) {
    int cnt = 0;
    int dY = (com.github.orpheus2015.geekbrains.java_0.TicTacToe.lastTurnY) + vY;
    int dX = (com.github.orpheus2015.geekbrains.java_0.TicTacToe.lastTurnX) + vX;
    while ((com.github.orpheus2015.geekbrains.java_0.TicTacToe.isValidCell(dY, dX)) && ((com.github.orpheus2015.geekbrains.java_0.TicTacToe.field[com.github.orpheus2015.geekbrains.java_0.TicTacToe.lastTurnY][com.github.orpheus2015.geekbrains.java_0.TicTacToe.lastTurnX]) == (com.github.orpheus2015.geekbrains.java_0.TicTacToe.field[dY][dX]))) {
        cnt++;
        dY += vY;
        dX += vX;
    } 
    return cnt;
}