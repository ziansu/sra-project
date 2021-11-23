@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int whichButton) {
    ((cgeo.geocaching.ui.EditNoteDialog.EditNoteDialogListener) (getActivity())).onFinishEditNoteDialog(mEditText.getText().toString());
    dialog.dismiss();
}