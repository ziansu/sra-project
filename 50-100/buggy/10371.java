private void removeInteractorLink(org.reactome.web.diagram.client.InteractorLink link) {
    org.reactome.web.diagram.data.InteractorsContent interactors = context.getInteractors();
    if (link instanceof org.reactome.web.diagram.client.DynamicLink) {
        org.reactome.web.diagram.client.DynamicLink aux = ((org.reactome.web.diagram.client.DynamicLink) (link));
        org.reactome.web.diagram.client.InteractorEntity entity = aux.getInteractorEntity();
        entity.removeLink(aux);
        if (entity.getLinks().isEmpty())
            interactors.removeFromView(currentResource, entity);
        
    }
    interactors.removeFromView(currentResource, link);
}