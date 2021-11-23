private void onTextChanged(java.lang.CharSequence newText) {
    mCurrentQuery = mSearchEditText.getText();
    if (!(android.text.TextUtils.isEmpty(mCurrentQuery))) {
        displayVoiceButton(false);
        displayClearButton(true);
    }else {
        displayClearButton(false);
        displayVoiceButton(true);
    }
    if (((mOnQueryTextListener) != null) && (!(android.text.TextUtils.equals(mOldQuery, mCurrentQuery)))) {
        mOnQueryTextListener.onQueryTextChange(newText.toString());
    }
    mOldQuery = mCurrentQuery;
}