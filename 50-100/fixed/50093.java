private void setResultContent() {
    android.content.Intent resultIntent = new android.content.Intent();
    mContent = mContentEditText.getText().toString().trim();
    resultIntent.putExtra(com.quartzodev.buddybook.AnnotationActivity.ARG_CONTENT, mContent);
    mFirebaseDatabaseHelper.updateBookAnnotation(mFirebaseAuth.getCurrentUser().getUid(), mFolderId, mBookId, mContent);
    setResult(Activity.RESULT_OK, resultIntent);
    finish();
}