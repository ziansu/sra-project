private void addChapters(java.util.List<org.gdg.frisbee.android.api.model.Chapter> chapterList) {
    if ((mChapterSpinner) == null) {
        return ;
    }
    java.util.Collections.sort(chapterList, mLocationComparator);
    mSpinnerAdapter.clear();
    mSpinnerAdapter.addAll(chapterList);
    mChapterSpinner.setAdapter(mSpinnerAdapter);
    if ((mSelectedChapter) != null) {
        int pos = mSpinnerAdapter.getPosition(mSelectedChapter);
        mChapterSpinner.setSelection(pos);
    }
}