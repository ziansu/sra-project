public void reloadIfEmpty() {
    if ((org.bbop.apollo.gwt.client.TrackPanel.dataProvider.getList().size()) == 0) {
        loadTracks(7000);
    }
}