protected void removeNode(glengine.yan.glengine.nodes.YANBaseNode node) {
    node.onDetachedFromScreen();
    getNodeList().remove(node);
    for (java.lang.Object c : node.getChildNodes()) {
        removeNode(((glengine.yan.glengine.nodes.YANBaseNode) (c)));
    }
    shouldSortNodes = true;
}