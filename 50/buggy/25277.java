public void initGui() {
    frame.setContentPane(new GuiMain().panel1);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setSize(1200, 800);
    frame.setJMenuBar(menueBar);
    frame.setVisible(true);
}