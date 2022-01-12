public static void show(java.lang.String file) {
    if ((com.github.handwriteppt.projector.Projector.instance) == null) {
        com.github.handwriteppt.projector.Projector.instance = new com.github.handwriteppt.projector.Projector();
    }
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