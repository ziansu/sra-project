public java.util.Map<java.util.UUID, java.util.UUID> getLinksFor(xstampp.model.ObserverValue linkType) {
    java.util.Map<java.util.UUID, java.util.UUID> links = new java.util.HashMap<>();
    if (this.linkMap.containsKey(linkType)) {
        for (xstampp.astpa.model.linking.Link link : getLinkObjectsFor(linkType)) {
            links.put(link.getLinkA(), link.getLinkB());
        }
    }
    return links;
}