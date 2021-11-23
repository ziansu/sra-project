@java.lang.Override
public void onDialogButtonClick(android.content.DialogInterface dialog, android.text.Editable editable, boolean isSure) {
    dialog.dismiss();
    if (isSure)
        showToast(editable.toString());
    
}