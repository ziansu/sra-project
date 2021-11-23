public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame("Snake Start");
    frame.setContentPane(new snake.StartPanel());
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.pack();
    frame.setPreferredSize(new java.awt.Dimension(400, 400));
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}