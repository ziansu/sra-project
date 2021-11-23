@java.lang.Override
public void onEvent(java.lang.Boolean data) {
    updateRemainingFormsToSyncCount();
    if ((updateMenuItem) != null) {
        updateMenuItem.setActionView(null);
    }
    updateRegisterCounts();
    org.ei.opensrp.indonesia.face.camera.util.Tools mtool = new org.ei.opensrp.indonesia.face.camera.util.Tools(context());
    mtool.setVectorfromAPI();
    mtool.parseSaveVector();
}