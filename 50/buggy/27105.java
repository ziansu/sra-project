private void showDisableBtnPage(boolean flag, java.lang.String content) {
    if (flag) {
        showFixToast(content);
        mCancelBtn.setEnabled(false);
        mHasOrderTV.setText(content);
    }
}