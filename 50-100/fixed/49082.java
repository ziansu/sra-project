@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.view.View dialogView = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.dialog_new_sound, null, false);
    setupRecordButton(dialogView);
    setupGalleryButton(dialogView);
    android.app.AlertDialog dialog;
    android.app.AlertDialog.Builder dialogBuilder = new org.catrobat.catroid.ui.dialogs.CustomAlertDialogBuilder(getActivity()).setView(dialogView).setTitle(R.string.new_sound_dialog_title);
    dialog = createDialog(dialogBuilder);
    dialog.setCanceledOnTouchOutside(true);
    return dialog;
}