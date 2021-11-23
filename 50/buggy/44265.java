@java.lang.Override
public void onQuestionsLoaded(java.util.List<com.jbrys.android.bloquery.api.model.Question> questions) {
    for (com.jbrys.android.bloquery.api.model.Question q : questions) {
        mQuestionList.add(q);
    }
    mAdapter.notifyDataSetChanged();
}