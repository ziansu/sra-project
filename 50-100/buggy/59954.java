@java.lang.Override
public void changed(es.eucm.ead.editor.view.widgets.Tabs.TabEvent event) {
    if ((currentGallery) != null) {
        currentGallery.remove();
    }
    currentGallery = galleries[tabs.getSelectedTabIndex()];
    addHideToolbarFunctionallity();
    addActor(currentGallery);
    if ((actionButton) != null) {
        actionButton.remove();
    }
    if ((currentGallery.getActionButton()) != null) {
        addActor((actionButton = currentGallery.getActionButton()));
    }
    loadContents();
}