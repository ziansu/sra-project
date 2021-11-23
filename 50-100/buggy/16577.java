protected void addNode(glengine.yan.glengine.nodes.YANBaseNode node) {
    node.onAttachedToScreen(this, mSortingLayerChangeListener);
    getNodeList().add(node);
    for (java.lang.Object c : node.getChildNodes()) {
        addNode(((glengine.yan.glengine.nodes.YANBaseNode) (c)));
    }
    shouldSortNodes = true;
}