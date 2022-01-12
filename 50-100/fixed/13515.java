@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.String path = recyclerViewAdapter.getSelectedPath();
    if (path != null) {
        if (path.equals(us.koller.cameraroll.ui.FileOperationDialogActivity.CREATE_NEW_FOLDER)) {
            creatingNewFolder = true;
            createNewFolder(files);
        }else {
            executeAction(files, path);
        }
    }
}