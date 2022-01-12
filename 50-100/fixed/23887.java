public void run(java.lang.String title) {
    this.init();
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.getContentPane().add(this);
    frame.setTitle(title);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}