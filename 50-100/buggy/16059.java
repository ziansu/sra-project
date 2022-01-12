public boolean isLinked(xstampp.model.ObserverValue linkType, java.util.UUID part) {
    if (this.linkMap.containsKey(linkType)) {
        for (xstampp.astpa.model.linking.Link link : this.linkMap.get(linkType)) {
            if (link.links(part)) {
                return true;
            }
        }
    }
    return false;
}