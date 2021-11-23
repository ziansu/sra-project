@java.lang.Override
public void onClick(android.view.View v) {
    listQuestions = dbQuestions.getAllBySubject(subject.getCatId());
    if (listQuestions.isEmpty()) {
        mAdapter.notifyDataSetChanged();
        rvSubjects.scrollToPosition(0);
    }
    mTvMore.setVisibility(View.GONE);
}