public void actionPerformed(java.awt.event.ActionEvent e) {
    flags.hideAllFlags();
    bombs.setBombs();
    bombs.printBombGrid();
    emptySquares = ((MyPanel.TOTAL_COLUMNS) * (MyPanel.TOTAL_ROWS)) - (bombs.getNumberOfBombs());
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            colorArray[j][i] = hiddenCellColor;
        }
    }
    repaint();
    java.lang.System.out.println(emptySquares);
}