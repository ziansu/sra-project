@java.lang.Override
public void onEvent(java.lang.Boolean data) {
    util.formula.Support.ONSYNC = true;
    updateRemainingFormsToSyncCount();
    if ((updateMenuItem) != null) {
        updateMenuItem.setActionView(null);
    }
    updateRegisterCounts();
    org.ei.opensrp.gizi.face.camera.util.Tools mTools = new org.ei.opensrp.gizi.face.camera.util.Tools(context());
    org.ei.opensrp.gizi.face.camera.util.Tools.download_images();
    org.ei.opensrp.gizi.face.camera.util.Tools.setVectorfromAPI(getApplicationContext());
    org.ei.opensrp.gizi.face.camera.util.Tools.setVectorsBuffered();
}