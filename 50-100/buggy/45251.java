private void onPositionChanged(int position) {
    mCurrentPosition = position;
    int count = mChapter.getPageCount();
    int page = position + 1;
    java.lang.String title = getString(R.string.chapter_title, page, count);
    setTitle(title);
    if (!(mToolbarHelper.isVisible())) {
        showCrouton(title);
    }
    if (page < count) {
        mStorage.setChapterPageReaded(mChapter, page);
    }else {
        mStorage.setChapterCompleted(mChapter);
    }
}