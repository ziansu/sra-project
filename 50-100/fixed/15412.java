@java.lang.Override
public void onEvent(java.lang.Boolean data) {
    updateRemainingFormsToSyncCount();
    if ((updateMenuItem) != null) {
        updateMenuItem.setActionView(null);
    }
    updateRegisterCounts();
    new org.ei.opensrp.vaksinator.face.camera.util.Tools(context());
    org.ei.opensrp.vaksinator.face.camera.util.Tools.setVectorfromAPI(getApplicationContext());
}