private void checkButton() {
    wordB = ((android.widget.EditText) (findViewById(R.id.editText))).getText().toString().trim();
    dbm.incrementWordTry(wordId);
    if ((!(wordB.isEmpty())) || (nl.mprog.axel.wrds_programmeerproject.Algorithms.AnswerComparison.checkCorrect(wordA, wordB))) {
        updateProgressBar();
        dataList.remove(randomInt);
        showFeedback(true);
    }else {
        showFeedback(false);
    }
}