public void disposeFrame(final java.lang.String canvasKey) {
    synchronized(key2canvasFrame) {
        final org.bytedeco.javacv.CanvasFrame frame = key2canvasFrame.get(canvasKey);
        if (frame != null) {
            key2canvasFrame.remove(canvasKey);
            javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    frame.dispose();
                }
            });
        }
    }
}