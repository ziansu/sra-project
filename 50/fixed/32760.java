public void reloadIfEmpty() {
    if (org.bbop.apollo.gwt.client.TrackPanel.dataProvider.getList().isEmpty()) {
        loadTracks(7000);
    }
}