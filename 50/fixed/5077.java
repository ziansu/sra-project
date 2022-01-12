@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mEditMode) {
        mFileContent.loadUrl(me.sheimi.android.utils.CodeGuesser.wrapUrlScript("save();"));
    }
}