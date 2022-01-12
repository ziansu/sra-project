@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    java.io.File report = presenter.getReferencesFor(idField.getValue());
    com.constellio.app.modules.rm.ui.pages.systemCheck.Resource resource = com.constellio.app.ui.framework.buttons.DownloadLink.wrapForDownload(new com.constellio.app.modules.rm.ui.pages.systemCheck.FileResource(report));
    com.constellio.app.modules.rm.ui.pages.systemCheck.Page.getCurrent().open(resource, "download", false);
}