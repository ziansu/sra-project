public boolean checkDiagsForWin(final java.lang.String playerFigure) {
    for (int diag_direction = 0; diag_direction < (com.java.laiy.controller.GameController.DIAGS_FOR_CHECK); diag_direction++) {
        if ((getPlayerForDiag(diag_direction, playerFigure)) == (board.getFiguresArray().length)) {
            return true;
        }
    }
    return false;
}