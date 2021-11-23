public void run(java.lang.String title) {
    Model.JGraphVistuallization applet = new Model.JGraphVistuallization();
    applet.init();
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.getContentPane().add(applet);
    frame.setTitle(title);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}