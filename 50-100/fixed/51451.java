@java.lang.Override
public void onSingleFileResolved(java.lang.String dirName, int fileCount, java.io.File resolvedFile, int sizeBytes) {
    storeFileList(fileCount, resolvedFile);
    setMaxPageIndex(fileCount);
    if (fileCount == 1) {
        mPageIndex = 1;
        mTitleName = dirName;
        requestReadComicView();
        org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.appsubaruod.comicviewer.utils.messages.SetImageEvent(mPageIndex, obtainFile(mPageIndex)));
        mHistoryOrganizer.addOrReflesh(new com.appsubaruod.comicviewer.viewmodel.HistoryItemViewModel(mTitleName, resolvedFile, 1));
        org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.appsubaruod.comicviewer.utils.messages.BookOpenedEvent());
    }
}