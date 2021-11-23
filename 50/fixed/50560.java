@java.lang.Override
public void clearRegisteredNode(org.bladerunnerjs.model.engine.Node node) {
    java.lang.String normalizedPath = node.dir().getAbsolutePath();
    java.util.List<org.bladerunnerjs.model.engine.Node> nodesForPath = nodeCache.get(normalizedPath);
    nodesForPath.remove(node);
}