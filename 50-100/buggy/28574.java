private void loadNextWord() {
    (mIndex)++;
    mEnglishWord.setVisibility(View.GONE);
    android.util.Log.i(TAG, ((("next word index: " + (mIndex)) + "japan max words: ") + (mUnicodeArray.length)));
    mLeftArrow.setVisibility(((mIndex) > 0 ? android.view.View.VISIBLE : android.view.View.GONE));
    if (mIsEnglish) {
        mListenButton.setEnabled(false);
        setupWord();
    }else {
        mListenButton.setEnabled(true);
        setupUnicodeLetter();
    }
}