public static javax.swing.JFrame getFrame() {
    if ((DrawUI.frame) == null) {
        DrawUI.frame = new javax.swing.JFrame("Remote_Checkers");
        DrawUI.frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        DrawUI.frame.setSize(1000, 1000);
        DrawUI.frame.setResizable(false);
        DrawUI.frame.setVisible(true);
    }
    return DrawUI.frame;
}