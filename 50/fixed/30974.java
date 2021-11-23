private void apply() {
    for (org.netbeans.modules.cnd.remote.sync.download.HostUpdatesRequestPanel.RowData data : model) {
        persistence.setFileSelected(data.fileInfo.getLocalFile(), data.selected, cbRememberChoice.isSelected());
    }
    persistence.store();
}