public void createFrame() {
    weatherFrame = new javax.swing.JFrame();
    weatherFrame.setSize(WIDTH, HEIGHT);
    weatherFrame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    weatherFrame.setLocationRelativeTo(null);
    weatherFrame.setResizable(false);
    weatherFrame.setUndecorated(true);
    weatherFrame.add(panel);
    weatherFrame.setVisible(true);
    frameDone = true;
}