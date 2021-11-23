private void showFrame() {
    javax.swing.JFrame frame = new javax.swing.JFrame("MainUI");
    frame.setContentPane(new MainUI().main_panel);
    frame.setPreferredSize(new java.awt.Dimension(720, 500));
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.pack();
    new MainUI.MenuUI().showMenu(frame);
    frame.setResizable(false);
    frame.setVisible(true);
}