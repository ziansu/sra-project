@java.lang.Override
public void done() {
    java.awt.image.BufferedImage map = null;
    try {
        map = get();
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e.getMessage());
    } catch (java.util.concurrent.ExecutionException e) {
        throw new java.lang.RuntimeException(e);
    }
    if (map != null) {
        previewPanel.image = map;
        previewPanel.repaint();
    }
    btnGenerate.setEnabled(true);
    btnPreview.setEnabled(true);
}