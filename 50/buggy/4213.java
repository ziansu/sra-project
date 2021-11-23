public void setTextContent(java.lang.String mTextContent) {
    if ((mCustomView) != null) {
        this.mTextContent = mTextContent;
        mCustomView.invalidate();
    }
    android.util.Log.d("test", "setTextContent: ");
}