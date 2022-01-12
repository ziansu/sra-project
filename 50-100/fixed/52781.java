public void initGUI() {
    java.awt.Dimension dim = new java.awt.Dimension(50, 50);
    setLayout(new java.awt.BorderLayout());
    setPreferredSize(dim);
    setMinimumSize(dim);
    setMaximumSize(dim);
    setSize(main.Game.APPLET_WIDTH, main.Game.APPLET_HEIGHT);
    createTeacherPanel();
    createInstructionPanel();
    activeView = "Intro Screen";
}