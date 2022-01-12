public void showBoardLine(final int row) {
    for (int i = 0; i < (game.getBoard().getRowLength(row)); i++) {
        if ((game.getBoard().getFigure(row, i)) == null) {
            java.lang.System.out.print(com.java.laiy.view.ConsoleView.EMPTY_FIGURE);
        }else {
            java.lang.System.out.print(game.getBoard().getFigure(row, i).toString());
        }
    }
    java.lang.System.out.println();
}