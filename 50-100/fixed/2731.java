public void nextWord() {
    mButton.setText(getString(R.string.show_definition));
    if (mData.moveToNext()) {
        mDefinitionTextView.setText("");
        mTermTextView.setText(mData.getString(mData.getColumnIndex(DroidTermsExampleContract.COLUMN_WORD)));
        mCurrentState = STATE_HIDDEN;
    }
}