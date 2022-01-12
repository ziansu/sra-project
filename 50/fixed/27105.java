private void showDisableBtnPage(boolean flag, java.lang.String content) {
    if (flag) {
        mCancelBtn.setEnabled(false);
        mHasOrderTV.setText(content);
    }
}