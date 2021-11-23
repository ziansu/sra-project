public void createView() {
    view = new gomokuonline.OnlineMenuView();
    onlineMenuFrame = new javax.swing.JFrame();
    onlineMenuFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    onlineMenuFrame.setContentPane(view);
    onlineMenuFrame.pack();
    onlineMenuFrame.setVisible(true);
    view.setController(this);
    view.setFrame(onlineMenuFrame);
}