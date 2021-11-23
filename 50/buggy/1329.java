public static void run(javax.swing.JApplet applet) {
    javax.swing.JFrame frame = new MainFrame();
    frame.getContentPane().add(applet);
    applet.init();
    applet.start();
}