public static android.app.DialogFragment instantiate(java.io.File file1) {
    com.dnielfe.manager.dialogs.GroupOwnerDialog.file = file1;
    java.lang.String[] mFileInfo = com.dnielfe.manager.utils.RootCommands.getFileProperties(com.dnielfe.manager.dialogs.GroupOwnerDialog.file);
    com.dnielfe.manager.dialogs.GroupOwnerDialog.oldowner = mFileInfo[1];
    com.dnielfe.manager.dialogs.GroupOwnerDialog.oldgroup = mFileInfo[2];
    return new com.dnielfe.manager.dialogs.GroupOwnerDialog();
}