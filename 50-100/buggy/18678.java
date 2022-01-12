public void bindBook(hci.com.vocaagent.Book book) {
    mBook = book;
    mTitleTextView.setText(mBook.getBookName());
    mDetailTextView.setText(((("단어수: " + (mBook.getWords().size())) + "\n\uc218\uc815\uc77c:") + (mBook.getLastModified())));
    changeViewHolderStatus(mSavedViewHolderStatus[index]);
    android.util.Log.d("TEST", ((index) + ""));
}