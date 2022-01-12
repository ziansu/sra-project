private void submitColor(javafx.scene.paint.Color color) {
    com.itemis.gef.tutorial.mindmap.operations.SetMindMapNodeColorOperation op = new com.itemis.gef.tutorial.mindmap.operations.SetMindMapNodeColorOperation(getHost(), color);
    try {
        getHost().getRoot().getViewer().getDomain().execute(op, null);
    } catch (org.eclipse.core.commands.ExecutionException e) {
        e.printStackTrace();
    }
}