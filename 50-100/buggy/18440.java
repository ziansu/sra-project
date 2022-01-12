public static void show(java.lang.String file) {
    com.github.handwriteppt.projector.Projector.instance = new com.github.handwriteppt.projector.Projector();
    com.github.handwriteppt.projector.Projector.instance.window = new javax.swing.JWindow(com.github.handwriteppt.DrawPad.getInstance());
    com.github.handwriteppt.projector.Projector.instance.load(file);
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.github.handwriteppt.projector.Projector.instance.initComponents();
            com.github.handwriteppt.projector.Projector.instance.prepareListeners();
            com.github.handwriteppt.projector.Projector.instance.start();
        }
    });
}