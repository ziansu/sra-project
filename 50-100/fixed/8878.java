public void onClick(com.gwtext.client.widgets.Button button, com.gwtext.client.core.EventObject e) {
    com.gwtext.client.widgets.tree.DefaultSelectionModel dsm = ((com.gwtext.client.widgets.tree.DefaultSelectionModel) (entityTreePanel.getSelectionModel()));
    com.gwtext.client.widgets.tree.TreeNode selectedNode = dsm.getSelectedNode();
    if ((selectedNode.getAttributeAsObject("frame")) != null) {
        edWindow.loadFrameAndShow(selectedNode);
    }
}