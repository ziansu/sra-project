public void createView() {
    this.view = new gomokuonline.RegisterView();
    registerFrame = new javax.swing.JFrame();
    registerFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    registerFrame.setContentPane(view);
    registerFrame.pack();
    registerFrame.setVisible(true);
    view.setController(this);
    view.setFrame(registerFrame);
}