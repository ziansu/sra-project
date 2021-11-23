public java.util.List<xstampp.astpa.model.linking.Link> getLinksFor(xstampp.model.ObserverValue linkType) {
    java.util.List<xstampp.astpa.model.linking.Link> links = new java.util.ArrayList<>();
    if (this.linkMap.containsKey(linkType)) {
        for (xstampp.astpa.model.linking.Link link : getLinkObjectsFor(linkType)) {
            links.add(new xstampp.astpa.model.linking.Link(link.getLinkA(), link.getLinkB()));
        }
    }
    return links;
}