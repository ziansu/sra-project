@java.lang.Override
public void onEvent(java.lang.Boolean data) {
    util.formula.Support.ONSYNC = true;
    updateRemainingFormsToSyncCount();
    if ((updateMenuItem) != null) {
        updateMenuItem.setActionView(null);
    }
    updateRegisterCounts();
    new org.ei.opensrp.gizi.face.camera.util.Tools(context());
    org.ei.opensrp.gizi.face.camera.util.Tools.setVectorfromAPI(getApplicationContext());
}