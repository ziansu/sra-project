@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dm.delete(allFiles[index]);
    dialog.dismiss();
    mDialog.dismiss();
}