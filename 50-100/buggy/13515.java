@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.String path = recyclerViewAdapter.getSelectedPath();
    if (path != null) {
        if (path.equals(us.koller.cameraroll.ui.FileOperationDialogActivity.CREATE_NEW_FOLDER)) {
            creatingNewFolder = true;
            createNewFolder(new us.koller.cameraroll.ui.FileOperationDialogActivity.NewFolderCallback() {
                @java.lang.Override
                public void newFolderCreated(java.lang.String path) {
                    executeAction(files, path);
                }

                @java.lang.Override
                public void failed() {
                    setResult(us.koller.cameraroll.ui.RESULT_CANCELED, null);
                    finish();
                }
            });
        }else {
            executeAction(files, path);
        }
    }
}