@amidst.documentation.CalledOnlyBy(value = amidst.documentation.AmidstThread.EDT)
private javax.swing.JFileChooser createMinecraftWorldFileChooser() {
    javax.swing.JFileChooser result = new javax.swing.JFileChooser(mojangApi.getSaves());
    result.setFileFilter(new amidst.gui.main.LevelFileFilter());
    result.setAcceptAllFileFilterUsed(false);
    result.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
    result.setFileHidingEnabled(false);
    return result;
}