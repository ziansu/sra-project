@java.lang.Override
public void FaceDown() {
    timber.log.Timber.d("FaceDown");
    if ((!(isReady)) || (isGameOver))
        return ;
    
    if ((index) >= (randomWordsFromDb.size()))
        return ;
    
    gameRecord.add(new info.einverne.guesswords.data.SingleData(randomWordsFromDb.get(index), true));
    (index)++;
    tv_guessing_word.setText(randomWordsFromDb.get(index));
}