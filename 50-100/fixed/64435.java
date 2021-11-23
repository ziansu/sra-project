private void removeInteractors(org.reactome.web.diagram.data.layout.Node node) {
    org.reactome.web.diagram.data.InteractorsContent interactors = context.getInteractors();
    for (org.reactome.web.diagram.client.InteractorLink link : interactors.getInteractorLinks(currentResource, node)) {
        removeInteractorLink(link);
    }
    eventBus.fireEventFromSource(new org.reactome.web.diagram.client.InteractorsLayoutUpdatedEvent(), this);
}