@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (((chapters) != null) && (!(chapters.isEmpty()))) {
        outState.putParcelableArrayList(org.gdg.frisbee.android.chapter.MainActivity.ARG_CHAPTERS, chapters);
    }
    if ((mViewPagerAdapter) != null) {
        outState.putString(org.gdg.frisbee.android.chapter.MainActivity.ARG_SELECTED_CHAPTER, mViewPagerAdapter.getSelectedChapter());
    }
}