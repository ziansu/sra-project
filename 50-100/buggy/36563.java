@java.lang.Override
public void onClick(android.view.View v) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    android.app.Fragment prev = getFragmentManager().findFragmentByTag(com.door43.translationstudio.newui.home.ImportDialog.TAG);
    if (prev != null) {
        ft.remove(prev);
    }
    ft.addToBackStack(null);
    com.door43.translationstudio.newui.home.RestoreFromCloudDialog dialog = new com.door43.translationstudio.newui.home.RestoreFromCloudDialog();
    dialog.setNewKeyRegistrationListener(new com.door43.translationstudio.newui.home.RestoreFromCloudDialog.OnNewKeyRegistrationListener() {
        @java.lang.Override
        public void onNewKeyRegistration() {
            importCloudButton.callOnClick();
        }
    });
    dialog.show(ft, com.door43.translationstudio.newui.home.ImportDialog.TAG);
    dismiss();
}