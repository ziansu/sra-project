@java.lang.Override
public void onInteractorsResourceChanged(org.reactome.web.diagram.client.InteractorsResourceChangedEvent event) {
    context.getContent().clearDisplayedInteractors();
    if (context.getInteractors().isInteractorResourceCached(event.getResource())) {
        org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.graph.model.GraphObject> identifiersMap = context.getContent().getIdentifierMap();
        context.getInteractors().restoreInteractorsSummary(event.getResource(), identifiersMap);
    }
    forceDraw = true;
}