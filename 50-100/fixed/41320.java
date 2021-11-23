public static boolean checkWinner(java.lang.String symbol, Cell[][] cells) {
    boolean HaveWinner = false;
    HaveWinner = gameMaster.checkRaws(symbol, cells);
    HaveWinner = HaveWinner || (gameMaster.checkColum(symbol, cells));
    HaveWinner = HaveWinner || (gameMaster.checkDiagonal(symbol, cells));
    return HaveWinner;
}