public void deleteAllFor(xstampp.model.ObserverValue linkType, java.util.UUID part) {
    java.util.List<xstampp.astpa.model.linking.Link> links = new java.util.ArrayList<>();
    if (this.linkMap.containsKey(linkType)) {
        for (xstampp.astpa.model.linking.Link link : this.linkMap.get(linkType)) {
            if ((part == null) || (link.links(part))) {
                links.add(link);
            }
        }
        deleteLinks(linkType, links);
    }
}