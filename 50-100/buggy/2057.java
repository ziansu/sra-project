public void setContent(com.pratilipi.mobile.android.datafiles.Pratilipi pratilipi, int chapterCount, java.lang.Integer position) {
    this.mPratilipi = pratilipi;
    this.mChapterCount = chapterCount;
    this.mPosition = position;
    if (((mChapterNumbers) == null) || ((mChapterNumbers.size()) == 0))
        this.mCurrentChapter = 1;
    else
        this.mCurrentChapter = java.lang.Integer.parseInt(mChapterNumbers.get(position));
    
    this.mFragmentContentChanged = true;
    getContentFromDb(mCurrentChapter, com.pratilipi.mobile.android.reader.ReaderAdapter.RANDOM_CHAPTER);
}