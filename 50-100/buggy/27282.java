@java.lang.Override
public void onInteractorsResourceChanged(final org.reactome.web.diagram.data.loader.InteractorsResourceChangedEvent event) {
    if (!(context.getInteractors().isInteractorResourceCached(event.getResource()))) {
        org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE = event.getResource();
        interactorsLoader.load(content.getStableId(), org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE);
    }
}