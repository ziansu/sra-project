@java.lang.Override
public void run() {
    int offset = content.toLowerCase().indexOf(mSearchQuery.toLowerCase());
    int line = mTvChapterContent.getLayout().getLineForOffset(offset);
    int coordinateY = mTvChapterContent.getLayout().getLineTop(line);
    mSvChapterContent.scrollTo(0, (coordinateY - 400));
}