void deleteLinks(xstampp.model.ObserverValue linkType, java.util.List<xstampp.astpa.model.linking.Link> links) {
    if (this.linkMap.containsKey(linkType)) {
        this.linkMap.get(linkType).removeAll(links);
        this.linkMap.remove(linkType);
    }
    setChanged();
    notifyObservers(new xstampp.astpa.model.linking.UndoRemoveLinkingCallback(this, linkType, links));
}