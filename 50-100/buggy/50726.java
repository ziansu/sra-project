private void submitColor(javafx.scene.paint.Color color) {
    if ((getHost()) instanceof com.itemis.gef.tutorial.mindmap.parts.MindMapNodePart) {
        com.itemis.gef.tutorial.mindmap.parts.MindMapNodePart host = ((com.itemis.gef.tutorial.mindmap.parts.MindMapNodePart) (getHost()));
        com.itemis.gef.tutorial.mindmap.operations.SetMindMapNodeColorOperation op = new com.itemis.gef.tutorial.mindmap.operations.SetMindMapNodeColorOperation(host, color);
        try {
            host.getRoot().getViewer().getDomain().execute(op, null);
        } catch (org.eclipse.core.commands.ExecutionException e) {
            e.printStackTrace();
        }
    }
}