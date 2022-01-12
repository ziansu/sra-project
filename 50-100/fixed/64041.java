@java.lang.Override
public void onDialogClosed(java.io.File file, int which) {
    if (which == (android.content.DialogInterface.BUTTON_POSITIVE)) {
        if (oldFolder != null)
            mUserPrefs.removeRomsFolder(oldFolder, true);
        
        mUserPrefs.addRomsFolder(file.getAbsolutePath());
        refreshList();
    }else
        if (file != null) {
            updateFolder(oldFolder, file);
        }
    
}