public static net.miginfocom.swing.MigLayout getMigLayout(java.lang.String layoutConstraints, java.lang.String columnConstraints, java.lang.String rowConstraints) {
    java.lang.String finalLayouConstraints = null;
    if (org.jskat.gui.swing.LayoutFactory.isMacOS()) {
        finalLayouConstraints = org.jskat.gui.swing.LayoutFactory.injectMacOSLayoutConstraints(layoutConstraints);
    }else {
        finalLayouConstraints = layoutConstraints;
    }
    return new net.miginfocom.swing.MigLayout(finalLayouConstraints, columnConstraints, rowConstraints);
}