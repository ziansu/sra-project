private void initialize() {
    frame = new javax.swing.JFrame("GitUser v1.1");
    frame.setBounds(100, 100, 500, 500);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new java.awt.CardLayout(0, 0));
    gituser.MainMenu panel_1 = new gituser.MainMenu(frame);
    frame.getContentPane().add(panel_1, "main_menu");
}