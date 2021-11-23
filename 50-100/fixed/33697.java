@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    java.lang.String oldValue = getStringFromSharedPreference(keyId);
    putStringInSharedPreference(java.lang.String.valueOf(s), keyId);
    if ((!(validateText(keyId))) && (org.eyeseetea.uicapp.ScrollingActivity.isValidationErrorActive)) {
        editText.setError(getApplicationContext().getString(errorId));
    }else {
        editText.setError(null);
    }
    refreshCode();
}