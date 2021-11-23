@java.lang.Override
public void onInteractorsResourceChanged(org.reactome.web.diagram.controls.settings.tabs.InteractorsResourceChangedEvent event) {
    if ((context) != null) {
        java.lang.String resourceName = org.reactome.web.diagram.util.interactors.ResourceNameFormatter.format(event.getResource());
        downloadBtn.setText(resourceName);
        downloadBtn.setTitle(("Click to download all diagram interactors from " + resourceName));
        showDownloadButton(context.getInteractors().isResourceLoaded(event.getResource()));
    }
}