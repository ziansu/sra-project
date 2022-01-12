public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new ChessGameDriver();
    frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    frame.pack();
    frame.setResizable(true);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    ChessGame game = new ChessGame();
}