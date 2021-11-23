@java.lang.Override
public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    mKeyword = s.toString();
    getSupportLoaderManager().restartLoader(0, null, this);
}