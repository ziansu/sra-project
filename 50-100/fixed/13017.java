private java.util.Collection<tools.gsf.navigation.AssetNode> _getDescendents(tools.gsf.navigation.AssetNode n) {
    java.util.Set<tools.gsf.navigation.AssetNode> descendents = new java.util.HashSet<>();
    for (tools.gsf.navigation.AssetNode kid : n.getChildren()) {
        descendents.add(kid);
        descendents.addAll(_getDescendents(kid));
    }
    return descendents;
}