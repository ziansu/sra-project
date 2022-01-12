private boolean restoreInstance(android.os.Bundle bundle) {
    if (bundle == null) {
        return false;
    }
    java.lang.String saveFileName = getArguments().getString(menion.android.whereyougo.gui.dialog.ChooseSavegameDialog.SAVE_FILE);
    if (saveFileName == null) {
        return false;
    }
    saveFile = new java.io.File(saveFileName);
    return true;
}