@java.lang.Override
public java.awt.image.BufferedImage doInBackground() {
    java.awt.Dimension bounds = new java.awt.Dimension(previewPanel.getWidth(), previewPanel.getHeight());
    try {
        return new nortantis.MapCreator().createMap(settings, bounds, null);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        util.ImageHelper.shutdownThreadPool();
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    return null;
}