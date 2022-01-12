public void updateNodeMapping(org.eclipse.core.resources.IMarker original, org.eclipse.core.resources.IMarker updatedMarker) {
    org.jboss.tools.windup.ui.internal.explorer.MarkerNode node = ((org.jboss.tools.windup.ui.internal.explorer.MarkerNode) (nodeMap.get(original)));
    if (node != null) {
        node.setMarker(updatedMarker);
        nodeMap.remove(original);
        nodeMap.put(updatedMarker, node);
    }
}