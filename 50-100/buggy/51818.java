@java.lang.Override
public java.awt.image.BufferedImage doInBackground() {
    try {
        java.awt.image.BufferedImage map = new nortantis.MapCreator().createMap(settings, null, null);
        util.ImageHelper.openImageInSystemDefaultEditor(map, ("map_" + (settings.randomSeed)));
        return map;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        util.ImageHelper.shutdownThreadPool();
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    return null;
}