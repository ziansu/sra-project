@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.rmr.ngusarov.geoquiz.CheatActivity.class);
    i.putExtra(com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.QUEST_INDEX_TRUE_FALSE_PARAMETR, com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.questArr[counter].isQuestionResult());
    startActivityForResult(i, 0);
}