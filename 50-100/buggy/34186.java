@java.lang.Override
public void run() {
    javax.swing.JFrame frame = new javax.swing.JFrame("JCR Workbench");
    frame.setSize(com.uttama.jcr.workbench.JCRWorkbench.defaultAppletSize);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    com.uttama.jcr.workbench.JCRWorkbench applet = new com.uttama.jcr.workbench.JCRWorkbench();
    frame.getContentPane().add(applet);
    applet.buildGui();
    frame.pack();
    frame.setVisible(true);
}