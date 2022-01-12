@java.lang.Override
public void onClick(android.view.View v) {
    if (org.buildmlearn.toolkit.templates.LearnSpellingTemplate.validated(activity, word, meaning)) {
        java.lang.String wordText = word.getText().toString().trim();
        java.lang.String meaningText = meaning.getText().toString().trim();
        org.buildmlearn.toolkit.templates.LearnSpellingModel temp = new org.buildmlearn.toolkit.templates.LearnSpellingModel(wordText, meaningText);
        mLearnSpellingData.add(temp);
        adapter.notifyDataSetChanged();
        setEmptyView(activity);
        dialog.dismiss();
    }
}