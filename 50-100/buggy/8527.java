public void disposeFrame(final java.lang.String canvasKey) {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            synchronized(key2canvasFrame) {
                org.bytedeco.javacv.CanvasFrame frame = key2canvasFrame.get(canvasKey);
                if (frame != null) {
                    frame.dispose();
                    key2canvasFrame.remove(canvasKey);
                }
            }
        }
    });
}