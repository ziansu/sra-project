@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dm.delete(allFiles[index]);
    updateFiles();
    dialog.dismiss();
    mDialog.dismiss();
}