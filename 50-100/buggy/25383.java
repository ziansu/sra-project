private void setRecyclerSubjectView() {
    java.util.List<io.uscool.quizapp.models.Chapter> chapterList = io.uscool.quizapp.database.QuizDatabaseHelper.getChapters(getContext(), mSubjectId);
    io.uscool.quizapp.adapters.ChapterAdapter chapterAdapter = new io.uscool.quizapp.adapters.ChapterAdapter(chapterList, getContext());
    setOnclickListener(chapterAdapter, chapterList);
    android.support.v7.widget.GridLayoutManager gridLayoutManager = new android.support.v7.widget.GridLayoutManager(mActivity, 1);
    mRecycleView.setLayoutManager(gridLayoutManager);
    mRecycleView.setAdapter(chapterAdapter);
}