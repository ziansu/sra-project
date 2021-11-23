@java.lang.Override
public void onClick(android.view.View v) {
    if (shouldPersist()) {
        mValue = (mSeekBar.getProgress()) + (mMin);
        persistInt(mSeekBar.getProgress());
        callChangeListener(java.lang.Integer.valueOf(mSeekBar.getProgress()));
    }
    ((android.app.AlertDialog) (getDialog())).dismiss();
}