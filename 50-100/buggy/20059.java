@java.lang.Override
public void ancestorRemoved(javax.swing.event.AncestorEvent event) {
    int index = selectionTab.getSelectedIndex();
    java.lang.String osName = java.lang.System.getProperty("os.name", "");
    if ((osName.startsWith("Mac OS X")) && (selectionTab.getTitleAt(index).equals("Region"))) {
        ucar.unidata.idv.ui.DataSelectionWidget.logger.trace("{}: changing tab", selectionTab.hashCode());
        autoTabChange = true;
        selectionTab.setSelectedIndex(0);
        originalTabIndex = index;
    }
}