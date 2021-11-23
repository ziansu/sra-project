private void apply() {
    persistence.setRememberChoice(cbRememberChoice.isSelected());
    for (org.netbeans.modules.cnd.remote.sync.download.HostUpdatesRequestPanel.RowData data : model) {
        persistence.setFileSelected(data.fileInfo.getLocalFile(), data.selected);
    }
    persistence.store();
}