public void animateText(java.lang.String text, chris234k.yorhawatchface.ICompletionCallback completionCallback) {
    if (!(mIsAnimating)) {
        mTextContent = text;
        mTextValue.replace(0, mTextValue.length(), "");
        mTextIndex = 0;
        mFrameIndex = 0;
        mIsAnimating = true;
        mCompletionCallback = completionCallback;
    }
}