@java.lang.Override
public void onClick(android.view.View view) {
    org.catrobat.catroid.ui.dialogs.NewVariableDialog dialog = new org.catrobat.catroid.ui.dialogs.NewVariableDialog();
    dialog.show(fragmentActivity.getSupportFragmentManager(), NewDataDialog.DIALOG_FRAGMENT_TAG);
}