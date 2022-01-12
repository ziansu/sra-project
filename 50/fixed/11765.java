@java.lang.Override
public void onClick(android.view.View v) {
    acceptDialogClick(v, mShouldPaste.isChecked());
    dismiss();
}