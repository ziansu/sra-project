@java.lang.Override
public void run() {
    int offset = content.indexOf(mSearchQuery);
    int line = mTvChapterContent.getLayout().getLineForOffset(offset);
    int coordinateY = mTvChapterContent.getLayout().getLineTop(line);
    mSvChapterContent.scrollTo(0, (coordinateY - 400));
}