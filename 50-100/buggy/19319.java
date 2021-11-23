private boolean isLinkIdValid(int linkid, int currentId) {
    if (linkid == currentId) {
        return false;
    }
    java.util.List<data.json.graph.LinkDataContainer> links = nodes.get(currentId).getLinkedNode();
    if (links != null) {
        for (data.json.graph.LinkDataContainer ln : links) {
            if ((ln.getLinkId()) == linkid) {
                return false;
            }
        }
        return true;
    }
    return true;
}