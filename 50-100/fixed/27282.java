@java.lang.Override
public void onInteractorsResourceChanged(final org.reactome.web.diagram.data.loader.InteractorsResourceChangedEvent event) {
    org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE = event.getResource();
    if (((org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE) != null) && (!(context.getInteractors().isInteractorResourceCached(org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE)))) {
        interactorsLoader.load(content.getStableId(), org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE);
    }
}