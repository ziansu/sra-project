@java.lang.Override
public void FaceUp() {
    timber.log.Timber.d("FaceUp");
    if ((!(isReady)) || (isGameOver))
        return ;
    
    if ((index) >= (randomWordsFromDb.size()))
        return ;
    
    gameRecord.add(new info.einverne.guesswords.data.SingleData(randomWordsFromDb.get(index), false));
    tv_guessing_word.setText(randomWordsFromDb.get(index));
    (index)++;
}