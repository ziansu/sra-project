@java.lang.Override
public void onQuestionsLoaded(java.util.List<com.jbrys.android.bloquery.api.model.Question> questions) {
    for (com.jbrys.android.bloquery.api.model.Question q : questions) {
        if (mQuestionList.contains(q)) {
            continue;
        }
        mQuestionList.add(q);
    }
    mAdapter.notifyDataSetChanged();
}