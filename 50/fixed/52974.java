@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int which) {
    deleteBottomFolder(path);
    dialog.dismiss();
    dialog = null;
}