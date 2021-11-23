@java.lang.Override
protected void onPause() {
    super.onResume();
    if (mEditMode) {
        mFileContent.loadUrl(me.sheimi.android.utils.CodeGuesser.wrapUrlScript("save();"));
    }
}