@java.lang.Override
public void setTabs(java.lang.String[] tabName, es.eucm.ead.editor.view.widgets.galleries.basegalleries.ThumbnailsGallery... tabWidget) {
    if ((currentGallery) != null) {
        currentGallery.remove();
    }
    currentGallery = tabWidget[0];
    tabs.setItems(tabName);
    tabs.addListener(new es.eucm.ead.editor.view.widgets.Tabs.TabListener() {
        @java.lang.Override
        public void changed(es.eucm.ead.editor.view.widgets.Tabs.TabEvent event) {
            loadContents();
        }
    });
    addActor(currentGallery);
    loadContents();
}