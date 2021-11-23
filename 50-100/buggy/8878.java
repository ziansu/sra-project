public void onClick(com.gwtext.client.widgets.Button button, com.gwtext.client.core.EventObject e) {
    com.gwtext.client.widgets.tree.DefaultSelectionModel dsm = ((com.gwtext.client.widgets.tree.DefaultSelectionModel) (entityTreePanel.getSelectionModel()));
    com.gwtext.client.widgets.tree.TreeNode selectedNode = dsm.getSelectedNode();
    if ((selectedNode.getAttributeAsObject("frame")) != null) {
        edu.stanford.bmir.protege.web.shared.xd.data.entityframes.AbstractOntologyEntityFrame selectedFrame = ((edu.stanford.bmir.protege.web.shared.xd.data.entityframes.AbstractOntologyEntityFrame) (selectedNode.getAttributeAsObject("frame")));
        edWindow.loadFrameAndShow(selectedFrame);
    }
}