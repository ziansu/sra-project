@java.lang.Override
public void onInteractorsResourceChanged(org.reactome.web.diagram.client.InteractorsResourceChangedEvent event) {
    context.getContent().clearDisplayedInteractors();
    if (context.getInteractors().isInteractorResourceCached(event.getResource())) {
        context.getInteractors().restoreInteractorsSummary(event.getResource(), context.getContent());
    }
    forceDraw = true;
}