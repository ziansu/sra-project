public int getCurrent() {
    java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (mText)).getText());
    validateCurrentView(str);
    return mCurrent;
}