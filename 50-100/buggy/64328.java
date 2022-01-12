@java.lang.Override
public void onDialogPositiveClick(final android.app.DialogFragment dialog, final int position, final java.lang.String text) {
    if (position == 0) {
        for (int i = (listNames.size()) - 1; i > 1; i--) {
            backupSingleList(backupNames, listNames.get(i));
        }
    }else {
        backupSingleList(backupNames, text);
    }
}