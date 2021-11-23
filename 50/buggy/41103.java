private void removeFunction(de.dfki.vsm.model.sceneflow.definition.FunDef funDef) {
    if (funDef != null) {
        mSceneFlow.removeUsrCmdDef(funDef.getName());
        de.dfki.vsm.editor.Editor.getInstance().update();
        launchFunctionCreatedEvent(funDef);
    }
}