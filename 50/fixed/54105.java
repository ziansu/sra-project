@java.lang.Override
public void run() {
    mMyViewPage.setCurrentItem((fragmentCount - 1));
    mReaderAdapter.setCurrentChapter((fragmentCount - 1));
    updateSeekBar();
    setDrawerItemSelected(mReaderAdapter.getCurrentChapter());
}