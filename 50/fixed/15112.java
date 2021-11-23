public void updatePathDisplay() {
    mPathComponents.clear();
    for (de.dfki.vsm.model.sceneflow.SuperNode superNode : mEditor.getSceneFlowManager().getActiveSuperNodes()) {
        mPathComponents.add(superNode);
    }
    updatePathText();
}