private void removeInteractors(org.reactome.web.diagram.data.layout.Node node) {
    org.reactome.web.diagram.data.InteractorsContent interactors = context.getInteractors();
    java.util.List<org.reactome.web.diagram.client.InteractorLink> interactions = interactors.getInteractorLinks(currentResource, node);
    for (org.reactome.web.diagram.client.InteractorLink link : interactions) {
        removeInteractorLink(link);
    }
    eventBus.fireEventFromSource(new org.reactome.web.diagram.client.InteractorsLayoutUpdatedEvent(), this);
}