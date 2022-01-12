public static void displayGameBoard() {
    copenhagen.Hnefatafl.frame = new javax.swing.JFrame("Hnefatafl");
    copenhagen.Hnefatafl.frame.add(copenhagen.Hnefatafl.board, java.awt.BorderLayout.LINE_START);
    copenhagen.Hnefatafl.frame.add(copenhagen.Hnefatafl.side, java.awt.BorderLayout.EAST);
    copenhagen.Hnefatafl.frame.setJMenuBar(copenhagen.Hnefatafl.menuBar);
    copenhagen.Hnefatafl.frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    copenhagen.Hnefatafl.frame.pack();
    copenhagen.Hnefatafl.frame.setVisible(true);
}