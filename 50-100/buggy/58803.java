@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    if ((!(currentName.equals(charSequence.toString()))) && (!(android.text.TextUtils.isEmpty(charSequence.toString())))) {
        mEditProfileBtn.setAlpha(1);
        mEditProfileBtn.setClickable(true);
    }else {
        backToCleanState();
    }
}