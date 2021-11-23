public void createView() {
    this.view = new gomokuonline.RegisterView();
    registerFrame = new javax.swing.JFrame();
    registerFrame.setContentPane(view);
    registerFrame.pack();
    registerFrame.setVisible(true);
    view.setController(this);
    view.setFrame(registerFrame);
}