@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    if ((mSelectedLocaleResources) != null) {
        java.lang.String content = mTranslatedStringEditText.getText().toString();
        mSelectedLocaleResources.setContent(mSelectedResourceId, content);
    }
}