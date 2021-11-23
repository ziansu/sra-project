@java.lang.Override
public void resetView() {
    isNotePageShow = false;
    addButton.setVisibility(View.VISIBLE);
    fragment_layout.setEnabled(true);
    showDiary();
    if ((lineChart) != null)
        lineChart.invalidate();
    
    updateCalendarView((-1));
    android.util.Log.d(com.ubicomp.ketdiary.fragment.DaybookFragment.TAG, ("DiaryCount:" + (diaryList.getChildCount())));
}