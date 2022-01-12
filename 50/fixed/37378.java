@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        confirmRename(((android.widget.EditText) (v)), mRenamePos);
    }
}