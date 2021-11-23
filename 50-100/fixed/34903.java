@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String phraseString = getPhrase().toLowerCase();
    float rating = getRating();
    android.content.Intent data = new android.content.Intent();
    cmsc436.counttoten.PhraseItem.packageIntent(data, phraseString, rating);
    setResult(cmsc436.counttoten.RESULT_OK, data);
    finish();
}