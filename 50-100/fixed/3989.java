@java.lang.Override
public void onStatChange(com.example.cis.mazeminotaurs.character.stats.Score score, int newValue) {
    if ((mSheetPlayerCharacter.getScore(score).getScore()) != newValue) {
        mSheetPlayerCharacter.getScore(score).setScore(newValue);
        mSheetPlayerCharacter.validateScores();
        refreshView();
    }
}