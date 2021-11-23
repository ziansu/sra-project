@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    mEditTextCallback.changeErrorView();
    mEditTextCallback.toggleLineColorOnError(false);
    if ((s.length()) == 0) {
        mEditTextCallback.saveIdentificationName("");
    }
}