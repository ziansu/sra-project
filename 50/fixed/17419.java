@java.lang.Override
public void onDialogCancelClick(android.app.DialogFragment dialog, int positionOfAdapter, java.lang.String kindOfAdapter) {
    getFragment().noteCardsChoosenAfterCancelDialog(kindOfAdapter, positionOfAdapter);
}