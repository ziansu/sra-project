@java.lang.Override
public void onClick(android.view.View v) {
    if (shouldPersist()) {
        mValue = (mSeekBar.getProgress()) + (mMin);
        persistInt(((mSeekBar.getProgress()) + (mMin)));
        callChangeListener(((mSeekBar.getProgress()) + (mMin)));
    }
    ((android.app.AlertDialog) (getDialog())).dismiss();
}