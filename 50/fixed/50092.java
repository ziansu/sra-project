@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    mFocusedView = (hasFocus) ? v : null;
    if ((mReceipt) == null) {
        new co.smartreceipts.android.widget.ShowSoftKeyboardOnFocusChangeListener().onFocusChange(v, hasFocus);
    }
}