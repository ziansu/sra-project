@java.lang.Override
public void onPageFlingToBottom(boolean isContinue) {
    isFinish = true;
    if ((!isContinue) || ((mTextReaderView.getReadMode()) != (com.sunteam.library.entity.ReadMode.READ_MODE_ALL))) {
        com.sunteam.library.utils.PublicUtils.showToast(this, this.getString(R.string.library_to_bottom));
        return ;
    }
    toNextChapter();
}