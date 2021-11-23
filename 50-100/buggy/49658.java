@java.lang.Override
public java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        org.liberty.android.fantastischmemo.domain.Card delCard = currentCard;
        currentCard = cardDao.queryNextCard(currentCard, currentCategory);
        cardDao.delete(currentCard);
        currentCard = delCard;
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e);
    }
    return null;
}