@java.lang.Override
public void onClick(android.view.View v) {
    if (org.buildmlearn.toolkit.templates.LearnSpellingTemplate.validated(activity, word, meaning)) {
        java.lang.String wordText = word.getText().toString();
        java.lang.String meaningText = meaning.getText().toString();
        org.buildmlearn.toolkit.templates.LearnSpellingModel temp = new org.buildmlearn.toolkit.templates.LearnSpellingModel(wordText, meaningText);
        mLearnSpellingData.add(temp);
        adapter.notifyDataSetChanged();
        dialog.dismiss();
    }
}