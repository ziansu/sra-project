@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.app.Dialog.BUTTON_NEGATIVE :
            dialog.cancel();
            break;
        case android.app.Dialog.BUTTON_POSITIVE :
            dialog.dismiss();
            if ((com.geekeclectic.android.stashcache.SelectFabricDialogFragment.mSelectedIndex) != (-1)) {
                com.geekeclectic.android.stashcache.SelectFabricDialogFragment.mSelectFabricDialogCallback.onSelectedFabric(com.geekeclectic.android.stashcache.SelectFabricDialogFragment.mFabrics.get(com.geekeclectic.android.stashcache.SelectFabricDialogFragment.mSelectedIndex));
            }
            break;
        default :
            com.geekeclectic.android.stashcache.SelectFabricDialogFragment.mSelectedIndex = which;
            break;
    }
}