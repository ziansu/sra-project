public void onClick(android.content.DialogInterface dialog, int which) {
    final de.htwberlin.f4.ai.ma.node.Node node = de.htwberlin.f4.ai.ma.node.NodeFactory.createInstance(nodeID, nodeDescription, null, coordinates, picPathToSave, "");
    JSONWriter.writeJSON(node);
    databaseHandler.updateNode(node, oldNodeId);
    android.widget.Toast.makeText(context, getString(R.string.node_saved_toast), Toast.LENGTH_LONG).show();
    deleteOldPictures();
    resetUiElements();
}