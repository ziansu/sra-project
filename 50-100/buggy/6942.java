public void increaseWorkSpaceLevel(de.dfki.vsm.editor.Node node) {
    mIgnoreMouseInput = true;
    clearCurrentWorkspace();
    de.dfki.vsm.model.sceneflow.SuperNode superNode = ((de.dfki.vsm.model.sceneflow.SuperNode) (node.getDataNode()));
    getSceneFlowManager().addActiveSuperNode(superNode);
    mSceneFlowEditor.addPathComponent(superNode);
    mGridManager.update();
    showCurrentWorkSpace();
}