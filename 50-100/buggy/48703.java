public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object source = e.getSource();
    for (int i = 0; i < (boardSquares.length); i++) {
        for (int j = 0; j < (boardSquares.length); j++) {
            if (source == (boardSquares[i][j])) {
                copenhagen.Hnefatafl.squareClicked(i, j, boardSquares[i][j]);
            }
        }
    }
}