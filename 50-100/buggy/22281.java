public java.util.List<java.lang.String> getSelectedPackets(java.lang.String tableName) {
    org.yamcs.ui.archivebrowser.DataViewer dataViewer = ((org.yamcs.ui.archivebrowser.DataViewer) (activeItem));
    if (dataViewer.getDataView().indexBoxes.containsKey(tableName)) {
        return dataViewer.getDataView().getSelectedPackets("tm");
    }
    return java.util.Collections.emptyList();
}